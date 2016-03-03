/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aew
/*    */   implements afg
/*    */ {
/*    */   public boolean a(aae paramaae, ahb paramahb)
/*    */   {
/* 12 */     int i = 0;
/* 13 */     Object localObject = null;
/*    */     
/* 15 */     for (int j = 0; j < paramaae.a(); j++) {
/* 16 */       add localadd = paramaae.a(j);
/* 17 */       if (localadd != null)
/*    */       {
/* 19 */         if (localadd.b() == ade.bB) {
/* 20 */           if (localObject != null) return false;
/* 21 */           localObject = localadd;
/* 22 */         } else if (localadd.b() == ade.bA) {
/* 23 */           i++;
/*    */         } else {
/* 25 */           return false;
/*    */         }
/*    */       }
/*    */     }
/* 29 */     return (localObject != null) && (i > 0);
/*    */   }
/*    */   
/*    */   public add a(aae paramaae)
/*    */   {
/* 34 */     int i = 0;
/* 35 */     Object localObject = null;
/*    */     
/* 37 */     for (int j = 0; j < paramaae.a(); j++) {
/* 38 */       add localadd2 = paramaae.a(j);
/* 39 */       if (localadd2 != null)
/*    */       {
/* 41 */         if (localadd2.b() == ade.bB) {
/* 42 */           if (localObject != null) return null;
/* 43 */           localObject = localadd2;
/* 44 */         } else if (localadd2.b() == ade.bA) {
/* 45 */           i++;
/*    */         } else {
/* 47 */           return null;
/*    */         }
/*    */       }
/*    */     }
/* 51 */     if ((localObject == null) || (i < 1)) { return null;
/*    */     }
/* 53 */     add localadd1 = new add(ade.bB, i + 1);
/* 54 */     localadd1.d((dh)((add)localObject).q().b());
/* 55 */     if (((add)localObject).u()) localadd1.c(((add)localObject).s());
/* 56 */     return localadd1;
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 61 */     return 9;
/*    */   }
/*    */   
/*    */   public add b()
/*    */   {
/* 66 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */