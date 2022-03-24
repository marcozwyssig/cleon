@echo off
chcp 65001

REM change dir to where the script is located
cd %~dp0

REM make sure no previous results are misinterpretted
echo purge previous files
del "Sample_Planung.docx" > nul 2>&1


REM goto exit
if errorlevel 1 goto extract_failed
echo successfully

REM render
:render
echo now rendering
"%ProgramFiles(x86)%\DocumentGenerator\bin\render.exe" -z -t template.docx -L 2 -P -l=de-CH -f "Sample_Planung.xml" ^
-D=Title:"Sample Planung" ^
-D=EAMod_Reviewers:""
echo rendering maybe done

if errorlevel 1 goto render_failed
echo rendering failed
call "Sample_Planung.docx"
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

REM Actifsource ID=[0498e2c9-3f84-11e6-85d8-3328a679e82b,1fcfd79b-5f5b-11ec-8bf8-75e284c95ea7,ZOHcBC+dRuZqYQN/5ObedFGmeg4=]
