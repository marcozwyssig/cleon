@ECHO OFF
SET var=file:/%cd%
ECHO Repository: %var%

java -jar c:\tools\as\plugins\org.eclipse.equinox.launcher_1.4.0.v20161219-1356.jar -application org.eclipse.equinox.p2.publisher.UpdateSitePublisher -metadataRepository %var% -artifactRepository %var% -source %cd% -compress -publishArtifacts