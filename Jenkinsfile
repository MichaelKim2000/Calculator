pipeline {
       
    
    environment {
    	
        mavenHome = tool 'JenkinsMaven'
        PATH = "$PATH:$mavenHome/bin"
    }


	agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11'
            args '-v $HOME/.m2:/root/.m2'
        }
    }

  
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