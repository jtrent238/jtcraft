/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afb
/*    */   implements afg
/*    */ {
/*    */   public boolean a(aae paramaae, ahb paramahb)
/*    */   {
/* 11 */     int i = 0;
/* 12 */     Object localObject = null;
/*    */     
/* 14 */     for (int j = 0; j < paramaae.a(); j++) {
/* 15 */       add localadd = paramaae.a(j);
/* 16 */       if (localadd != null)
/*    */       {
/* 18 */         if (localadd.b() == ade.aY) {
/* 19 */           if (localObject != null) return false;
/* 20 */           localObject = localadd;
/* 21 */         } else if (localadd.b() == ade.bJ) {
/* 22 */           i++;
/*    */         } else {
/* 24 */           return false;
/*    */         }
/*    */       }
/*    */     }
/* 28 */     return (localObject != null) && (i > 0);
/*    */   }
/*    */   
/*    */   public add a(aae paramaae)
/*    */   {
/* 33 */     int i = 0;
/* 34 */     Object localObject = null;
/*    */     
/* 36 */     for (int j = 0; j < paramaae.a(); j++) {
/* 37 */       add localadd2 = paramaae.a(j);
/* 38 */       if (localadd2 != null)
/*    */       {
/* 40 */         if (localadd2.b() == ade.aY) {
/* 41 */           if (localObject != null) return null;
/* 42 */           localObject = localadd2;
/* 43 */         } else if (localadd2.b() == ade.bJ) {
/* 44 */           i++;
/*    */         } else {
/* 46 */           return null;
/*    */         }
/*    */       }
/*    */     }
/* 50 */     if ((localObject == null) || (i < 1)) { return null;
/*    */     }
/* 52 */     add localadd1 = new add(ade.aY, i + 1, ((add)localObject).k());
/* 53 */     if (((add)localObject).u()) localadd1.c(((add)localObject).s());
/* 54 */     return localadd1;
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 59 */     return 9;
/*    */   }
/*    */   
/*    */   public add b()
/*    */   {
/* 64 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\afb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */