{:user {:local-repo "/srv/lein/repo"
        :dependencies [[slamhound "1.5.5"]]
        :plugins [[lein-ancient "0.6.8" :exclusions [org.clojure/clojure]]
                  [lein-difftest "2.0.0"]
                  [lein-kibit "0.1.2"]
                  [jonase/eastwood "0.2.3"]]
        :aliases {"slamhound" ["run" "-m" "slam.hound"]}}}
