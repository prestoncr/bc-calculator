grammar Calculator;
//BC Calculator Implementation
@header 
{
import java.util.HashMap;
import java.util.Map;
}
@parser::members
{
private Map<String, Double> variables = new HashMap<String, Double>();
private void addVariable(String varname, double x1)
        {variables.put(varname, x1);}
private double getVariable(String varname)
        {return variables.get(varname);}
private void replaceVariable(String varname, double x2)
        {variables.replace(varname, x2);}
}
varDef:  ID '=' exprD {addVariable($ID.text, $exprD.i);}
        ;

exprList: topExpr ( ';' topExpr)* ';'? ; 

topExpr:  exprD  { System.out.println("result: "+ Double.toString($exprD.i));}  
         | varDef
        ;


    //NEED TO FIX:: Some expressions dont work with spaces
    exprD returns [double i]: 
    ID {$i = getVariable($ID.text);}
    | op='++' ID {double temp = getVariable($ID.text) + 1.0; replaceVariable($ID.text, temp);$i = getVariable($ID.text); }
    | ID op='++' {$i = getVariable($ID.text); double temp = $i + 1.0; replaceVariable($ID.text, temp);}
    | op= '--' ID {double temp = getVariable($ID.text) - 1.0; replaceVariable($ID.text, temp);$i = getVariable($ID.text); }
    | ID op='--' {$i = getVariable($ID.text); double temp = $i - 1.0; replaceVariable($ID.text, temp);}
    | el=exprD op='*' er=exprD { $i=$el.i*$er.i; }
    | el=exprD op='/' er=exprD { $i=$el.i/$er.i; }
    | el=exprD op='+' er=exprD { $i=$el.i+$er.i; }
    | el=exprD op='-' er=exprD { $i=$el.i-$er.i; }
    | el=exprD op='%' er=exprD { $i=$el.i%$er.i; }
    | el=exprD op='^' er=exprD { $i=Math.pow($el.i, $er.i);}
    | op='!' e=exprD          {if ($e.i == 0.0) $i = 1.0; else $i = 0.0;}
    | el=exprD op='&&' er=exprD {if($el.i != 0.0 && $er.i !=0.0) $i = 1.0; else $i = 0.0; }
    | el=exprD op='||' er=exprD {if($el.i != 0.0 || $er.i !=0.0) $i = 1.0; else $i = 0.0; }
    | DOUBLE { $i=Double.parseDouble($DOUBLE.text); }
    | INT {$i=(double)Integer.parseInt($INT.text);} 
    | '(' e=exprD ')' {$i = $exprD.i;} 
    ;

VAR: 'var';  // keyword
ID: [_A-Za-z]+ ;
DOUBLE: [-]?[0-9]+(.)[0-9]+;
INT: [-]?[0-9]+;
COMMENT: '/*'.* '*/' -> skip;
WS: [ \t\r\n]+ -> skip ;
// expr returns [int i]: 
//       el=expr op='*' er=expr { $i=$el.i*$er.i; }
//     | el=expr op='/' er=expr { $i=$el.i/$er.i; }
//     | el=expr op='+' er=expr { $i=$el.i+$er.i; }
//     | el=expr op='-' er=expr { $i=$el.i-$er.i; }
//     | el=expr op='%' er=expr { $i=$el.i%$er.i; }
//     | el=expr op='^' er=expr { $i=(int)Math.pow($el.i, $er.i);}
//     | op='!' e=expr          { if ($e.i == 0) $i = 1; else $i = 0; }
//     | el=expr op='&&' er=expr { $i=$el.i&$er.i;}
//     | el=expr op='||' er=expr { $i=$el.i|$er.i;}
//     | INT { $i=Integer.parseInt($INT.text); }
//     | ID {$i = (int)getVariable($ID.text);}
//     | '(' e=expr ')'  {$i = $expr.i;}  
//     ;
