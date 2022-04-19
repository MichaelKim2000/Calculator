node {
    stage('Checkout') { 
        git branch: 'main', 
            url: 'https://github.com/MichaelKim2000/Calculator.git'
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