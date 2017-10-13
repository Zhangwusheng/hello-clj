
(ns com.zws.clj.child
    (:import com.zws.java.TestIntf)
    (  :gen-class )

  )



(defn make-anomyous-testintf []
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