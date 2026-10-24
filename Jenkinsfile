pipeline {
    agent any

    stages {
        stage('last') {
            steps {
                echo 'this is the last to commit here...'
            }
        }
         stage('init') {
            steps {
                echo 'Now we are starting in big time...'
            }
        }
        stage('Build') {
            steps {
                echo 'We are building...'
            }
        }
         stage('Test') {
            steps {
                echo 'We are testing...'
            }
        }
         stage('Deploy') {
            steps {
                echo 'We are deploying...'
            }
        }
        stage('Build-image') {
            steps {
                echo 'We are building image...'
            }
        }
    }
}
