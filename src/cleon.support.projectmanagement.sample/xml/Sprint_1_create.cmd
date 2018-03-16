@echo off
chcp 65001

REM change dir to where the script is located
cd %~dp0

REM make sure no previous results are misinterpretted
echo purge previous files
del "Sprint_1.docx" > nul 2>&1


REM goto exit
if errorlevel 1 goto extract_failed
echo successfully

REM render
:render
echo now rendering
"%ProgramFiles(x86)%\DocumentGenerator\bin\render.exe" -z -t template.docx -L 2 -P -l=de-CH -f "Sprint_1.xml" ^
-D=Title:"Sprint 1" ^
-D=EAMod_Reviewers:""
echo rendering maybe done

if errorlevel 1 goto render_failed
echo rendering failed
call "Sprint_1.docx"
goto exit

:missing_parameter
echo expected exactly one parameter - core of the document name
goto exit

REM extract failed
:extract_failed
echo.
echo extract failed
echo.
goto failed

REM render failed
:render_failed
echo.
echo render failed
echo.
goto failed

:failed

pause

:exit

REM Actifsource ID=[0498e2c9-3f84-11e6-85d8-3328a679e82b,a900b602-c00a-11e5-a165-d34765931e10,RCqL1ZsHfZ4QgaQpm+vYnMh6uus=]
