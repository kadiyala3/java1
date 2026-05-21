// Save this file as HelloWorld.java
public class Pipe {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /*     pipeline {

    agent any

    environment {

        IMAGE = "rajesh3399/mavin"
        CONTAINER = "mavin-container"

    }

    stages {

        stage('Clone') {

            steps {

                git branch: 'main',
                url: 'https://github.com/kadiyala3/lol.git'

            }
        }

        stage('Build Maven Project') {

            steps {

                sh 'mvn clean package'

            }
        }

        stage('Build Docker Image') {

            steps {

                sh 'docker build -t ${IMAGE}:latest .'

            }
        }

        stage('Docker Login & Push') {

            steps {

                withCredentials([usernamePassword(

                    credentialsId: 'dockerhub',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'

                )]) {

                    sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'

                    sh 'docker push ${IMAGE}:latest'

                }
            }
        }

        stage('Run Docker Container') {

            steps {

                sh 'docker rm -f ${CONTAINER} || true'

                sh 'docker run -d --name ${CONTAINER} ${IMAGE}:latest'

            }
        }
    }

    post {

        success {

            echo 'Pipeline Executed Successfully'

        }

        failure {

            echo 'Pipeline Failed'

        }
    }
}                           */
        
        
    }
}

