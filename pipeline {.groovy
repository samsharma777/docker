pipeline {
    agent unix
    enviorment {
       NEW_VERSION = '1.3.0' 
    }
    stages {
        stage("build") {
            steps {
               echo  "Buildomg the applciaton"
               echo "building version ${NEW_VERSION}'"
            }
        }
        stage {
            steps {
                
            }
        }
        stage("test") {
            when {
                expression {
                    BRANCH_NMAE== 'dev' && CODE_CHANGES == true
            }
            steps {
                echo "Testing the application"
                
            }
        }
        stage {
            steps("deploy") {
                echo " Deploying the appliaton"
                
            }
        }
        
    
    }

}