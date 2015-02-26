{:user {
        :plugins [
                  [cider/cider-nrepl "0.9.0-SNAPSHOT"]
                  [lein-kibit "RELEASE"]
                  [lein-marginalia "0.7.1"]
                  [lein-deps-tree "0.1.2"]
                  [lein-ritz "0.7.0"]
                  [lein-ring "0.8.7"]
                  [org.clojars.hozumi/hiccup-bridge "1.0.0-SNAPSHOT"]
                  ;; from cldwalker / leinfiles
                  [lein-difftest "2.0.0"]
                  [lein-grep "0.1.0"]
                  [lein-open "0.1.0"]
                  [lein-ancient "0.6.2"]
                  [lein-exec "0.3.0"]
                  [lein-test-out "0.3.0"]
                  ;;[lein-pprint "1.1.1"]
                  ;;[lein-spell "0.1.0"]
                  ]
        :repl-options {
                       ;;                       :nrepl-middleware [ritz.nrepl.middleware.javadoc/wrap-javadoc
                       ;;                                          ritz.nrepl.middleware.simple-complete/wrap-simple-complete]
                      :nrepl-middleware [cider.nrepl.middleware.classpath/wrap-classpath
                                          cider.nrepl.middleware.complete/wrap-complete
                                          cider.nrepl.middleware.info/wrap-info
                                          cider.nrepl.middleware.inspect/wrap-inspect
                                          cider.nrepl.middleware.stacktrace/wrap-stacktrace
                                          cider.nrepl.middleware.trace/wrap-trace]
                       :init (do
                               ;;(use 'desc.core)
                               ;;(use 'rubydoc.core)
                               (use '[clojure.repl :only (dir-fn)])
;;                               (load-file (str (System/getProperty "user.home") "/.lein/user.clj"))
                               ) }
        :dependencies [[ritz/ritz-nrepl-middleware "0.7.0"]
                       ;;[table "0.4.0"]
                       ;;[desc "0.1.0"]
                       ;;[rubydoc "0.3.0"]
                       ]
;;        :jvm-opts ["-Dapple.awt.UIElement=true"]
        }
 ;; :hooks [ritz.add-sources]
 }
