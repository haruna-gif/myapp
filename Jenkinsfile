def gv

pipeline {
    agent any
   parameters {
    choice(name: 'VERSION', choices: ['0.0.1', '0.0.2', '0.0.3'], description: 'Select Version')
    booleanParam(name: 'execute', defaultValue: true, description: 'Dont wanna do')
    string(name: 'ENV', defaultValue: 'dev', description: 'which environment? dev or prod')
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
                    env.NEW = input message: "where to build?", ok: "Yes" parameters: [choice(name: 'NEW', choices['ogun', 'lagos', 'Akure'], description: '')]
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
            when {
                expression {
                    params.execute
                }
            }
            steps {
                script {
                    gv.docker()
                }
            }
        }
    }
}
