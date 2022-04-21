node {
    
    stage('Checkout') { 
        git branch: 'master', 
            url: 'git@github.com:MichaelKim2000/Calculator.git'
    }
    
    stage('Build') {    	
    
      	sh "mvn clean verify"
    	
    	//sh 'cd src/main/java'
    	//sh 'pwd'
        //sh 'javac com/cimpa/git/calculus/Calculator.java '
		echo "test jenkins 2"
        //sh 'true'
    }
    
    stage('Results') {
        junit '**/target/surefire-reports/*.xml'
        archiveArtifacts 'target/*.jar'
    }
}