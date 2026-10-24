def gv

pipeline {
    agent any
   parameters {
    choice(name: 'VERSION', choices: ['0.0.1', '0.0.2', '0.0.3'], description: 'Select Version')
    booleanParam(name: 'execute', defaultValue: true, description: 'Dont wanna do')
    }
    stages {
        stage('init') {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    gv.build()
                }
            }
        }
         stage('Test') {
            steps {
                script {
                    gv.test()
                }
            }
        }
         stage('Deploy') {
            steps {
                script {
                    gv.deploy()
                }
            }
        }
        stage('Docker') {
            steps {
                when{
                    expression {
                        params.execute
                    }
                }
                script {
                    gv.docker()
                }
            }
        }
    }
}
