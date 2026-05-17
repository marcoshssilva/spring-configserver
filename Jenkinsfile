@Library('java') _
pipelineUsingJava24AndMavenWithPublicDockerImage('marcoshssilva/spring-configserver', 'jdk-24'
    [
    'APP_NAME': 'spring-configserver',
    'DEPLOY': 'DOKKU',
    'DOKKU_SELECTED_BUILDPACK': 'pack',
    'ENABLE_SONARQUBE_CHECK': 'true',
    'AGENT_EXTRA_LABELS': 'node-builder'
    ])
