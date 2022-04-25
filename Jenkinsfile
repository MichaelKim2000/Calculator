pipeline {
	agent any
	  stages {     	  
	    stage('Checkout') { 
	    	steps {
	    		git branch: 'master', 
	            url: 'git@github.com:MichaelKim2000/Calculator.git'    
	    	}	        
	    }
	    
	    stage('Build') {
	    	steps {
    			sh "mvn clean package"	    	        
	    	}
		}     	    
		
		stage('Test') {
			steps {
    			junit '**/target/surefire-reports/*.xml'  
				archiveArtifacts 'target/*.jar'			        
			}	    		    		    
		}
		
	     	 
	        
	    
    }
}