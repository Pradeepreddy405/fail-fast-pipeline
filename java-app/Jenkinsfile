pipeline {
    agent any

    environment {
        APP_ENV = "${env.BRANCH_NAME}"
    }

    stages {
        stage('Print Env') {
            steps {
                echo "App Environment: ${env.APP_ENV}"
            }
        }
    }
}
