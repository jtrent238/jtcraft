/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class wb
/*     */ {
/*     */   private ahb a;
/*     */   private boolean b;
/*  17 */   private int c = -1;
/*     */   
/*     */   private int d;
/*     */   
/*     */   private int e;
/*     */   private vz f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   
/*     */   public wb(ahb paramahb)
/*     */   {
/*  29 */     this.a = paramahb;
/*     */   }
/*     */   
/*     */   public void a() {
/*  33 */     int j = 0;
/*  34 */     if (j != 0) {
/*  35 */       if (this.c == 2) {
/*  36 */         this.d = 100;
/*     */       }
/*     */     }
/*     */     else {
/*  40 */       if (this.a.w()) {
/*  41 */         this.c = 0;
/*  42 */         return;
/*     */       }
/*     */       
/*  45 */       if (this.c == 2) { return;
/*     */       }
/*  47 */       if (this.c == 0) {
/*  48 */         float f1 = this.a.c(0.0F);
/*  49 */         if ((f1 < 0.5D) || (f1 > 0.501D)) return;
/*  50 */         this.c = (this.a.s.nextInt(10) == 0 ? 1 : 2);
/*  51 */         this.b = false;
/*  52 */         if (this.c == 2) { return;
/*     */         }
/*     */       }
/*     */     }
/*  56 */     if (!this.b) {
/*  57 */       if (b()) this.b = true; else {
/*  58 */         return;
/*     */       }
/*     */     }
/*     */     
/*  62 */     if (this.e > 0) {
/*  63 */       this.e -= 1;
/*  64 */       return;
/*     */     }
/*     */     
/*  67 */     this.e = 2;
/*  68 */     if (this.d > 0) {
/*  69 */       c();
/*  70 */       this.d -= 1;
/*     */     } else {
/*  72 */       this.c = 2;
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean b()
/*     */   {
/*  78 */     List localList = this.a.h;
/*  79 */     for (yz localyz : localList) {
/*  80 */       this.f = this.a.A.a((int)localyz.s, (int)localyz.t, (int)localyz.u, 1);
/*  81 */       if ((this.f != null) && 
/*  82 */         (this.f.c() >= 10) && 
/*  83 */         (this.f.d() >= 20) && 
/*  84 */         (this.f.e() >= 20))
/*     */       {
/*     */ 
/*  87 */         r localr = this.f.a();
/*  88 */         float f1 = this.f.b();
/*     */         
/*  90 */         int j = 0;
/*  91 */         for (int k = 0; k < 10; k++) {
/*  92 */           this.g = (localr.a + (int)(qh.b(this.a.s.nextFloat() * 3.1415927F * 2.0F) * f1 * 0.9D));
/*  93 */           this.h = localr.b;
/*  94 */           this.i = (localr.c + (int)(qh.a(this.a.s.nextFloat() * 3.1415927F * 2.0F) * f1 * 0.9D));
/*  95 */           j = 0;
/*  96 */           for (vz localvz : this.a.A.b()) {
/*  97 */             if (localvz != this.f)
/*  98 */               if (localvz.a(this.g, this.h, this.i)) {
/*  99 */                 j = 1;
/* 100 */                 break;
/*     */               }
/*     */           }
/* 103 */           if (j == 0) break;
/*     */         }
/* 105 */         if (j != 0) { return false;
/*     */         }
/* 107 */         azw localazw = a(this.g, this.h, this.i);
/* 108 */         if (localazw != null)
/*     */         {
/* 110 */           this.e = 0;
/* 111 */           this.d = 20;
/* 112 */           return true;
/*     */         } } }
/* 114 */     return false;
/*     */   }
/*     */   
/*     */   private boolean c() {
/* 118 */     azw localazw = a(this.g, this.h, this.i);
/* 119 */     if (localazw == null) return false;
/*     */     yq localyq;
/*     */     try {
/* 122 */       localyq = new yq(this.a);
/* 123 */       localyq.a(null);
/* 124 */       localyq.j(false);
/*     */     } catch (Exception localException) {
/* 126 */       localException.printStackTrace();
/* 127 */       return false;
/*     */     }
/* 129 */     localyq.b(localazw.a, localazw.b, localazw.c, this.a.s.nextFloat() * 360.0F, 0.0F);
/* 130 */     this.a.d(localyq);
/* 131 */     r localr = this.f.a();
/* 132 */     localyq.a(localr.a, localr.b, localr.c, this.f.b());
/* 133 */     return true;
/*     */   }
/*     */   
/*     */   private azw a(int paramInt1, int paramInt2, int paramInt3) {
/* 137 */     for (int j = 0; j < 10; j++) {
/* 138 */       int k = paramInt1 + this.a.s.nextInt(16) - 8;
/* 139 */       int m = paramInt2 + this.a.s.nextInt(6) - 3;
/* 140 */       int n = paramInt3 + this.a.s.nextInt(16) - 8;
/* 141 */       if ((this.f.a(k, m, n)) && 
/* 142 */         (aho.a(sx.a, this.a, k, m, n))) azw.a(k, m, n);
/*     */     }
/* 144 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */