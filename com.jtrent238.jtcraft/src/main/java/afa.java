/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afa
/*    */ {
/* 11 */   private static final afa a = new afa();
/*    */   
/* 13 */   private Map b = new HashMap();
/* 14 */   private Map c = new HashMap();
/*    */   
/*    */   public static afa a() {
/* 17 */     return a;
/*    */   }
/*    */   
/*    */   private afa()
/*    */   {
/* 22 */     a(ajn.p, new add(ade.j), 0.7F);
/* 23 */     a(ajn.o, new add(ade.k), 1.0F);
/* 24 */     a(ajn.ag, new add(ade.i), 1.0F);
/* 25 */     a(ajn.m, new add(ajn.w), 0.1F);
/*    */     
/*    */ 
/* 28 */     a(ade.al, new add(ade.am), 0.35F);
/* 29 */     a(ade.bd, new add(ade.be), 0.35F);
/* 30 */     a(ade.bf, new add(ade.bg), 0.35F);
/* 31 */     a(ajn.e, new add(ajn.b), 0.1F);
/* 32 */     a(ade.aD, new add(ade.aC), 0.3F);
/* 33 */     a(ajn.aG, new add(ajn.ch), 0.35F);
/* 34 */     a(ajn.aF, new add(ade.aR, 1, 2), 0.2F);
/* 35 */     a(ajn.r, new add(ade.h, 1, 1), 0.15F);
/* 36 */     a(ajn.s, new add(ade.h, 1, 1), 0.15F);
/* 37 */     a(ajn.bA, new add(ade.bC), 1.0F);
/* 38 */     a(ade.bG, new add(ade.bH), 0.35F);
/* 39 */     a(ajn.aL, new add(ade.bT), 0.1F);
/*    */     
/* 41 */     for (acu localacu : acu.values()) {
/* 42 */       if (localacu.i()) {
/* 43 */         a(new add(ade.aP, 1, localacu.a()), new add(ade.aQ, 1, localacu.a()), 0.35F);
/*    */       }
/*    */     }
/*    */     
/*    */ 
/*    */ 
/* 49 */     a(ajn.q, new add(ade.h), 0.1F);
/* 50 */     a(ajn.ax, new add(ade.ax), 0.7F);
/*    */     
/* 52 */     a(ajn.x, new add(ade.aR, 1, 4), 0.2F);
/* 53 */     a(ajn.bY, new add(ade.bU), 0.2F);
/*    */   }
/*    */   
/*    */   public void a(aji paramaji, add paramadd, float paramFloat) {
/* 57 */     a(adb.a(paramaji), paramadd, paramFloat);
/*    */   }
/*    */   
/*    */   public void a(adb paramadb, add paramadd, float paramFloat) {
/* 61 */     a(new add(paramadb, 1, 32767), paramadd, paramFloat);
/*    */   }
/*    */   
/*    */   public void a(add paramadd1, add paramadd2, float paramFloat) {
/* 65 */     this.b.put(paramadd1, paramadd2);
/* 66 */     this.c.put(paramadd2, Float.valueOf(paramFloat));
/*    */   }
/*    */   
/*    */   public add a(add paramadd) {
/* 70 */     for (Map.Entry localEntry : this.b.entrySet()) {
/* 71 */       if (a(paramadd, (add)localEntry.getKey())) {
/* 72 */         return (add)localEntry.getValue();
/*    */       }
/*    */     }
/*    */     
/* 76 */     return null;
/*    */   }
/*    */   
/*    */   private boolean a(add paramadd1, add paramadd2) {
/* 80 */     return (paramadd2.b() == paramadd1.b()) && ((paramadd2.k() == 32767) || (paramadd2.k() == paramadd1.k()));
/*    */   }
/*    */   
/*    */   public Map b() {
/* 84 */     return this.b;
/*    */   }
/*    */   
/*    */   public float b(add paramadd) {
/* 88 */     for (Map.Entry localEntry : this.c.entrySet()) {
/* 89 */       if (a(paramadd, (add)localEntry.getKey())) {
/* 90 */         return ((Float)localEntry.getValue()).floatValue();
/*    */       }
/*    */     }
/* 93 */     return 0.0F;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\afa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */