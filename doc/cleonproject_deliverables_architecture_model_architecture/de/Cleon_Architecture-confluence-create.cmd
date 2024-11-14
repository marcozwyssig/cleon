chcp 65001
cmd /c bundle exec asciidoctor-confluence --host %CONFLUENCE_HOST% --spaceKey %CONFLUENCE_SPACE_KEY% --title Cleon_Architecture --username %CONFLUENCE_USER_NAME% --password %CONFLUENCE_PASSWORD% Cleon_Architecture.adoc
