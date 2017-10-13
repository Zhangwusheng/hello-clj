
(ns com.zws.clj.test2
    (:import com.zws.java.TestIntf)
    (  :gen-class )

  )



(defn make-anomyous-testintf2 []
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