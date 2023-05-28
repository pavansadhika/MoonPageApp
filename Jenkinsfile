pipeline{
    agent any 
    environment{
        VERSION = "${env.BUILD_ID}"
    }
    stages{
        stage("Build"){
            steps {
                sh mvn clean package       
            }
            
        }
        stage("docker build & docker push"){
            steps{
                script{
                    withCredentials([string(credentialsId: 'docker_pass', variable: 'docker_password')]) {
                             sh '''
                                docker build -t madhudockeracc/dev:${VERSION} .
                                docker login -u admin -p $docker_password 34.125.214.226:8083 
                                docker push  madhudockeracc/dev:${VERSION}
                                docker rmi madhudockeracc/dev:${VERSION}
                            '''
                    }
                }
            }
        }
     
    }
}
