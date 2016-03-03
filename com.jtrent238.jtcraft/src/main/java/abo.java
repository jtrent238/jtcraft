/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class abo
/*     */   extends adb
/*     */ {
/*     */   private aji a;
/*     */   
/*     */   public abo(aji paramaji)
/*     */   {
/*  14 */     this.h = 1;
/*  15 */     this.a = paramaji;
/*  16 */     a(abt.f);
/*     */   }
/*     */   
/*     */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*     */   {
/*  21 */     boolean bool = this.a == ajn.a;
/*     */     
/*  23 */     azu localazu = a(paramahb, paramyz, bool);
/*  24 */     if (localazu == null) { return paramadd;
/*     */     }
/*  26 */     if (localazu.a == azv.b) {
/*  27 */       int i = localazu.b;
/*  28 */       int j = localazu.c;
/*  29 */       int k = localazu.d;
/*     */       
/*  31 */       if (!paramahb.a(paramyz, i, j, k)) {
/*  32 */         return paramadd;
/*     */       }
/*     */       
/*  35 */       if (bool) {
/*  36 */         if (!paramyz.a(i, j, k, localazu.e, paramadd)) return paramadd;
/*  37 */         awt localawt = paramahb.a(i, j, k).o();
/*  38 */         int m = paramahb.e(i, j, k);
/*     */         
/*  40 */         if ((localawt == awt.h) && (m == 0)) {
/*  41 */           paramahb.f(i, j, k);
/*  42 */           return a(paramadd, paramyz, ade.as);
/*     */         }
/*     */         
/*  45 */         if ((localawt == awt.i) && (m == 0)) {
/*  46 */           paramahb.f(i, j, k);
/*  47 */           return a(paramadd, paramyz, ade.at);
/*     */         }
/*  49 */       } else { if (this.a == ajn.a) {
/*  50 */           return new add(ade.ar);
/*     */         }
/*  52 */         if (localazu.e == 0) j--;
/*  53 */         if (localazu.e == 1) j++;
/*  54 */         if (localazu.e == 2) k--;
/*  55 */         if (localazu.e == 3) k++;
/*  56 */         if (localazu.e == 4) i--;
/*  57 */         if (localazu.e == 5) { i++;
/*     */         }
/*  59 */         if (!paramyz.a(i, j, k, localazu.e, paramadd)) { return paramadd;
/*     */         }
/*  61 */         if ((a(paramahb, i, j, k)) && (!paramyz.bE.d)) {
/*  62 */           return new add(ade.ar);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  67 */     return paramadd;
/*     */   }
/*     */   
/*     */   private add a(add paramadd, yz paramyz, adb paramadb) {
/*  71 */     if (paramyz.bE.d) {
/*  72 */       return paramadd;
/*     */     }
/*     */     
/*  75 */     if (--paramadd.b <= 0) {
/*  76 */       return new add(paramadb);
/*     */     }
/*  78 */     if (!paramyz.bm.a(new add(paramadb))) {
/*  79 */       paramyz.a(new add(paramadb, 1, 0), false);
/*     */     }
/*  81 */     return paramadd;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  86 */     if (this.a == ajn.a) { return false;
/*     */     }
/*  88 */     awt localawt = paramahb.a(paramInt1, paramInt2, paramInt3).o();
/*  89 */     int i = !localawt.a() ? 1 : 0;
/*  90 */     if ((paramahb.c(paramInt1, paramInt2, paramInt3)) || (i != 0)) {
/*  91 */       if ((paramahb.t.f) && (this.a == ajn.i)) {
/*  92 */         paramahb.a(paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, "random.fizz", 0.5F, 2.6F + (paramahb.s.nextFloat() - paramahb.s.nextFloat()) * 0.8F);
/*     */         
/*  94 */         for (int j = 0; j < 8; j++) {
/*  95 */           paramahb.a("largesmoke", paramInt1 + Math.random(), paramInt2 + Math.random(), paramInt3 + Math.random(), 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */       } else {
/*  98 */         if ((!paramahb.E) && (i != 0) && (!localawt.d())) {
/*  99 */           paramahb.a(paramInt1, paramInt2, paramInt3, true);
/*     */         }
/*     */         
/* 102 */         paramahb.d(paramInt1, paramInt2, paramInt3, this.a, 0, 3);
/*     */       }
/*     */       
/* 105 */       return true;
/*     */     }
/*     */     
/* 108 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\abo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */