(defproject clj-statsd "0.4.1"
  :description "statsd protocol client"
  :url         "https://github.com/shmish111/clj-statsd"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :plugins [[s3-wagon-private "1.3.2" :exclusions [org.apache.httpcomponents/httpclient]]]
  :deploy-repositories [["releases" {:url           "s3p://clojure-deps/releases/"
                                     :username      :env/AWS_ACCESS_KEY
                                     :passphrase    :env/AWS_SECRET_KEY
                                     :sign-releases false}]]
  :dependencies [[org.clojure/clojure "1.8.0"]])
