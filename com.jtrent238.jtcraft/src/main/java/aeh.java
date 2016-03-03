/*     */ import com.google.common.collect.Multimap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aeh
/*     */   extends adb
/*     */ {
/*     */   private float a;
/*     */   private final adc b;
/*     */   
/*     */   public aeh(adc paramadc)
/*     */   {
/*  18 */     this.b = paramadc;
/*  19 */     this.h = 1;
/*  20 */     f(paramadc.a());
/*  21 */     a(abt.j);
/*     */     
/*  23 */     this.a = (4.0F + paramadc.c());
/*     */   }
/*     */   
/*     */   public float i() {
/*  27 */     return this.b.c();
/*     */   }
/*     */   
/*     */   public float a(add paramadd, aji paramaji)
/*     */   {
/*  32 */     if (paramaji == ajn.G)
/*     */     {
/*  34 */       return 15.0F;
/*     */     }
/*     */     
/*     */ 
/*  38 */     awt localawt = paramaji.o();
/*  39 */     if ((localawt == awt.k) || (localawt == awt.l) || (localawt == awt.v) || (localawt == awt.j) || (localawt == awt.C)) {
/*  40 */       return 1.5F;
/*     */     }
/*  42 */     return 1.0F;
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd, sv paramsv1, sv paramsv2)
/*     */   {
/*  47 */     paramadd.a(1, paramsv2);
/*  48 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(add paramadd, ahb paramahb, aji paramaji, int paramInt1, int paramInt2, int paramInt3, sv paramsv)
/*     */   {
/*  54 */     if (paramaji.f(paramahb, paramInt1, paramInt2, paramInt3) != 0.0D) paramadd.a(2, paramsv);
/*  55 */     return true;
/*     */   }
/*     */   
/*     */   public boolean f()
/*     */   {
/*  60 */     return true;
/*     */   }
/*     */   
/*     */   public aei d(add paramadd)
/*     */   {
/*  65 */     return aei.d;
/*     */   }
/*     */   
/*     */   public int d_(add paramadd)
/*     */   {
/*  70 */     return 72000;
/*     */   }
/*     */   
/*     */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*     */   {
/*  75 */     paramyz.a(paramadd, d_(paramadd));
/*  76 */     return paramadd;
/*     */   }
/*     */   
/*     */   public boolean b(aji paramaji)
/*     */   {
/*  81 */     return paramaji == ajn.G;
/*     */   }
/*     */   
/*     */   public int c()
/*     */   {
/*  86 */     return this.b.e();
/*     */   }
/*     */   
/*     */   public String j() {
/*  90 */     return this.b.toString();
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd1, add paramadd2)
/*     */   {
/*  95 */     if (this.b.f() == paramadd2.b()) {
/*  96 */       return true;
/*     */     }
/*  98 */     return super.a(paramadd1, paramadd2);
/*     */   }
/*     */   
/*     */   public Multimap k()
/*     */   {
/* 103 */     Multimap localMultimap = super.k();
/*     */     
/* 105 */     localMultimap.put(yj.e.a(), new tj(f, "Weapon modifier", this.a, 0));
/*     */     
/* 107 */     return localMultimap;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aeh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */