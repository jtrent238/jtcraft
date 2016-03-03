/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afc
/*    */   extends afh
/*    */ {
/*    */   public afc()
/*    */   {
/* 12 */     super(3, 3, new add[] { new add(ade.aF), new add(ade.aF), new add(ade.aF), new add(ade.aF), new add(ade.aY, 0, 32767), new add(ade.aF), new add(ade.aF), new add(ade.aF), new add(ade.aF) }, new add(ade.bJ, 0, 0));
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean a(aae paramaae, ahb paramahb)
/*    */   {
/* 21 */     if (!super.a(paramaae, paramahb)) return false;
/* 22 */     Object localObject = null;
/*    */     
/* 24 */     for (int i = 0; (i < paramaae.a()) && (localObject == null); i++) {
/* 25 */       add localadd = paramaae.a(i);
/* 26 */       if ((localadd != null) && (localadd.b() == ade.aY)) { localObject = localadd;
/*    */       }
/*    */     }
/* 29 */     if (localObject == null) return false;
/* 30 */     ayi localayi = ade.aY.a((add)localObject, paramahb);
/* 31 */     if (localayi == null) return false;
/* 32 */     return localayi.d < 4;
/*    */   }
/*    */   
/*    */   public add a(aae paramaae)
/*    */   {
/* 37 */     Object localObject = null;
/*    */     
/* 39 */     for (int i = 0; (i < paramaae.a()) && (localObject == null); i++) {
/* 40 */       add localadd = paramaae.a(i);
/* 41 */       if ((localadd != null) && (localadd.b() == ade.aY)) { localObject = localadd;
/*    */       }
/*    */     }
/* 44 */     localObject = ((add)localObject).m();
/* 45 */     ((add)localObject).b = 1;
/*    */     
/* 47 */     if (((add)localObject).q() == null) ((add)localObject).d(new dh());
/* 48 */     ((add)localObject).q().a("map_is_scaling", true);
/*    */     
/* 50 */     return (add)localObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\afc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */