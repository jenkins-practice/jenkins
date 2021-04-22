pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/jenkins-practice/springboot-app.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}