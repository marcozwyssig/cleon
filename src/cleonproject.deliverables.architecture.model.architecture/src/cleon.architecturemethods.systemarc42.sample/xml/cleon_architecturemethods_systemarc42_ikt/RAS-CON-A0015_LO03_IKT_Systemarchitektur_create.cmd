@echo off
chcp 65001

REM change dir to where the script is located
cd %~dp0

REM make sure no previous results are misinterpretted
echo purge previous files
del "RAS-CON-A0015_LO03_IKT_Systemarchitektur.docx" > nul 2>&1


REM goto exit
if errorlevel 1 goto extract_failed
echo successfully

REM render
:render
echo now rendering
"%ProgramFiles(x86)%\DocumentGenerator\bin\render.exe" -z -t template.docx -L 2 -P -l=de-CH -f "RAS-CON-A0015_LO03_IKT_Systemarchitektur.xml" ^
-D=Title:"RAS-CON-A0015_LO03_IKT Systemarchitektur" ^
-D=Klassifizierung:"INTERN" ^
-D=Subtitle:"" ^
-D=EAMod_Version:"1.0.0" ^
-D=EAMod_DocType:"Systemarchitektur" ^
-D=EAMod_Status:"In Progress" ^
-D=EAMod_Project:"" ^
-D=EAMod_Authors:"Pascal Meier" ^
-D=EAMod_Reviewers:""
echo rendering maybe done

if errorlevel 1 goto render_failed
echo rendering failed
call "RAS-CON-A0015_LO03_IKT_Systemarchitektur.docx"
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

REM Actifsource ID=[0498e2c9-3f84-11e6-85d8-3328a679e82b,35faf7e1-d10d-11e8-91a3-55b260d274ec,J8XdLYRu8PU8ZljgPulBNaFfF1g=]
