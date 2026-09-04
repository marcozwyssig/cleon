chcp 65001
cmd /c bundle exec asciidoctor-confluence --host %CONFLUENCE_HOST% --spaceKey %CONFLUENCE_SPACE_KEY% --title 20180312_my_protocol_protocol --username %CONFLUENCE_USER_NAME% --password %CONFLUENCE_PASSWORD% 20180312_my_protocol_protocol.adoc
