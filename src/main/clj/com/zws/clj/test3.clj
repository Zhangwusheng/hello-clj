
(ns com.zws.clj.test3
    (:import com.zws.java.TestIntf)
    (  :gen-class )

  )



(defn make-anomyous-testintf3 []
      (reify TestIntf
             (^void sayHello [this]
               (println "I am in sayHello")
                (println "zhangwusheng")
               )
        (^String satHello2 [this ^String p]
          (println p )
          (str "zhangwusheng")
          )

        )
      )

(defn -main []
  (println "zws")
  )