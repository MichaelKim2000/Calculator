node {
    stage('Checkout') { 
        git branch: 'master', 
            url: 'git@github.com:MichaelKim2000/https://github.com/MichaelKim2000/Calculator'
    }
    
    stage('Build') {
        sh '.javac -jar '
		echo "test jenkins 2"
        //sh 'true'
    }
    
    stage('Results') {
        junit '**/target/surefire-reports/*.xml'
        archiveArtifacts 'target/*.jar'
    }
}