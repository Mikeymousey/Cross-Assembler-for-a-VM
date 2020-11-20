@echo Compiling Programs ...
@echo off
C:
CD "C:\Users\Luca-Desktop\Desktop\FALL-2020\SOEN341\TEAM\PROJECT B\cm\src\assembler"

"C:\Program Files\Java\jdk-15\bin\javac.exe" TestNode.java

@echo Running Programs ...
@if exist Tests.txt                                       del Tests.txt

"C:\Program Files\Java\jdk-15\bin\java.exe"  TestNode >  Tests.txt

type Tests.txt
@echo on
@echo Checking test result...
"C:\Program Files\Java\jdk-15\bin\java.exe"  aunit Tests.txt
pause
