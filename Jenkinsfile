pipeline {
	agent {
	    docker {
	        image 'maven:3.3.3'
	    }

	}

  	stages {
  	    stage ('testing')
  	    	steps {
  	    	    git branch: 'master', 
    		        url: 'git@github.com:MichaelKim2000/Calculator.git'
    		    sh 'mvn --version'
  	    	}

  	}

  
    //stage('Checkout') { 
    //    git branch: 'master', 
    //        url: 'git@github.com:MichaelKim2000/Calculator.git'
    //}
    
    //stage('Build') {    	    
    //  	sh 'mvn clean verify'	    		
        //sh 'true'
    //}
    
    //stage('Results') {
    //    junit '**/target/surefire-reports/*.xml'
    //    archiveArtifacts 'target/*.jar'
    //}
        
    

    
}