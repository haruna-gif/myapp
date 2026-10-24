def gv

pipeline {
    agent any
    environment {
        VER = '1.0.0'
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
                script {
                    gv.docker()
                }
            }
        }
    }
}
