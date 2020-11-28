@ECHO OFF
C:
CD "C:\Users\Luca-Desktop\Desktop\FALL-2020\SOEN341\TEAM\PROJECT B\gitrepo\Cross-Assembler-for-a-VM\Cross-Assembler for Virtual Machine\src"

javac -cp . test/aunit.java
ECHO Compiling all TestClasses....
javac -cp . test/TestNode.java
javac -cp . test/TestComment.java
javac -cp . test/TestLabel.java
REM javac -cp . test/TestParser.java
javac -cp . test/TestLexicalanalyzer.java
javac -cp . test/TestOperand.java
javac -cp . test/TestErrorMessage.java
REM javac -cp . test/TestErrorReporter.java
javac -cp . test/TestLinestatement.java
javac -cp . test/TestMnemonic.java
javac -cp . test/TestPosition.java
javac -cp . test/TestSymbolTable.java


pause
ECHO Running all TestClasses....



ECHO ...Running TestNode....
java  -cp . test/TestNode     >  Tests.txt
ECHO ...Running TestComment....
java  -cp . test/TestComment    >>  Tests.txt
ECHO ...Running TestLabel....
java  -cp . test/TestLabel    >>  Tests.txt
ECHO ...Running TestParser....
REM java  -cp . test/TestParser    >>  Tests.txt
ECHO ...Running TestOperand....
java  -cp . test/TestOperand    >>  Tests.txt
ECHO ...Running TestLexicalanalyzer....
java  -cp . test/TestLexicalanalyzer    >>  Tests.txt
ECHO ...Running TestErrormessage....
java  -cp . test/TestErrorMessage     >>  Tests.txt
ECHO ...Running TestErrorReporter....
REM java  -cp . test/TestErrorReporter     >>  Tests.txt
ECHO ...Running TestLinestatement....
java  -cp . test/TestLinestatement     >>  Tests.txt
ECHO ...Running TestMnemonic....
java  -cp . test/TestMnemonic     >>  Tests.txt
ECHO ...Running TestPosition....
java  -cp . test/TestPosition     >>  Tests.txt
ECHO ...Running TestSymbolTable....
java  -cp . test/TestSymbolTable     >>  Tests.txt

ECHO ...Running aunit and outputting results....
type Tests.txt
java  -cp . test/aunit     Tests.txt
pause
