/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class acm
/*     */   extends adb
/*     */ {
/*     */   public boolean e(add paramadd)
/*     */   {
/*  15 */     return true;
/*     */   }
/*     */   
/*     */   public boolean e_(add paramadd)
/*     */   {
/*  20 */     return false;
/*     */   }
/*     */   
/*     */   public adq f(add paramadd)
/*     */   {
/*  25 */     if (g(paramadd).c() > 0) {
/*  26 */       return adq.b;
/*     */     }
/*  28 */     return super.f(paramadd);
/*     */   }
/*     */   
/*     */   public dq g(add paramadd)
/*     */   {
/*  33 */     if ((paramadd.d == null) || (!paramadd.d.b("StoredEnchantments", 9))) {
/*  34 */       return new dq();
/*     */     }
/*     */     
/*  37 */     return (dq)paramadd.d.a("StoredEnchantments");
/*     */   }
/*     */   
/*     */   public void a(add paramadd, yz paramyz, List paramList, boolean paramBoolean)
/*     */   {
/*  42 */     super.a(paramadd, paramyz, paramList, paramBoolean);
/*     */     
/*  44 */     dq localdq = g(paramadd);
/*     */     
/*  46 */     if (localdq != null) {
/*  47 */       for (int i = 0; i < localdq.c(); i++) {
/*  48 */         int j = localdq.b(i).e("id");
/*  49 */         int k = localdq.b(i).e("lvl");
/*     */         
/*  51 */         if (aft.b[j] != null) {
/*  52 */           paramList.add(aft.b[j].c(k));
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(add paramadd, agc paramagc) {
/*  59 */     dq localdq = g(paramadd);
/*  60 */     int i = 1;
/*     */     
/*  62 */     for (int j = 0; j < localdq.c(); j++) {
/*  63 */       dh localdh2 = localdq.b(j);
/*     */       
/*  65 */       if (localdh2.e("id") == paramagc.b.B) {
/*  66 */         if (localdh2.e("lvl") < paramagc.c) {
/*  67 */           localdh2.a("lvl", (short)paramagc.c);
/*     */         }
/*     */         
/*  70 */         i = 0;
/*  71 */         break;
/*     */       }
/*     */     }
/*     */     
/*  75 */     if (i != 0) {
/*  76 */       dh localdh1 = new dh();
/*     */       
/*  78 */       localdh1.a("id", (short)paramagc.b.B);
/*  79 */       localdh1.a("lvl", (short)paramagc.c);
/*     */       
/*  81 */       localdq.a(localdh1);
/*     */     }
/*     */     
/*  84 */     if (!paramadd.p()) paramadd.d(new dh());
/*  85 */     paramadd.q().a("StoredEnchantments", localdq);
/*     */   }
/*     */   
/*     */   public add a(agc paramagc) {
/*  89 */     add localadd = new add(this);
/*  90 */     a(localadd, paramagc);
/*  91 */     return localadd;
/*     */   }
/*     */   
/*     */   public void a(aft paramaft, List paramList) {
/*  95 */     for (int i = paramaft.d(); i <= paramaft.b(); i++) {
/*  96 */       paramList.add(a(new agc(paramaft, i)));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public qx b(Random paramRandom)
/*     */   {
/* 111 */     return a(paramRandom, 1, 1, 1);
/*     */   }
/*     */   
/*     */   public qx a(Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/* 115 */     add localadd = new add(ade.aG, 1, 0);
/* 116 */     afv.a(paramRandom, localadd, 30);
/*     */     
/* 118 */     return new qx(localadd, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */