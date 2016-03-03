/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acs
/*    */   extends adb
/*    */ {
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 35 */     if (!paramahb.E)
/*    */     {
/*    */ 
/* 38 */       zf localzf = new zf(paramahb, paramInt1 + paramFloat1, paramInt2 + paramFloat2, paramInt3 + paramFloat3, paramadd);
/* 39 */       paramahb.d(localzf);
/*    */       
/* 41 */       if (!paramyz.bE.d) {
/* 42 */         paramadd.b -= 1;
/*    */       }
/* 44 */       return true;
/*    */     }
/*    */     
/* 47 */     return false;
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(add paramadd, yz paramyz, List paramList, boolean paramBoolean)
/*    */   {
/* 53 */     if (!paramadd.p()) {
/* 54 */       return;
/*    */     }
/* 56 */     dh localdh1 = paramadd.q().m("Fireworks");
/* 57 */     if (localdh1 == null) {
/* 58 */       return;
/*    */     }
/* 60 */     if (localdh1.b("Flight", 99)) {
/* 61 */       paramList.add(dd.a("item.fireworks.flight") + " " + localdh1.d("Flight"));
/*    */     }
/*    */     
/*    */ 
/* 65 */     dq localdq = localdh1.c("Explosions", 10);
/* 66 */     if ((localdq != null) && (localdq.c() > 0))
/*    */     {
/* 68 */       for (int i = 0; i < localdq.c(); i++) {
/* 69 */         dh localdh2 = localdq.b(i);
/*    */         
/* 71 */         ArrayList localArrayList = new ArrayList();
/* 72 */         acr.a(localdh2, localArrayList);
/*    */         
/* 74 */         if (localArrayList.size() > 0) {
/* 75 */           for (int j = 1; j < localArrayList.size(); j++) {
/* 76 */             localArrayList.set(j, "  " + (String)localArrayList.get(j));
/*    */           }
/*    */           
/* 79 */           paramList.addAll(localArrayList);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */