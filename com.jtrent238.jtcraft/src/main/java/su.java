/*     */ import java.util.Iterator;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class su
/*     */   extends ss
/*     */ {
/*     */   public su(ahb paramahb)
/*     */   {
/*  22 */     super(paramahb);
/*     */   }
/*     */   
/*     */   public su(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  26 */     super(paramahb, paramInt1, paramInt2, paramInt3, 0);
/*  27 */     b(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  32 */     super.c();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(int paramInt) {}
/*     */   
/*     */ 
/*     */   public int f()
/*     */   {
/*  42 */     return 9;
/*     */   }
/*     */   
/*     */   public int i()
/*     */   {
/*  47 */     return 9;
/*     */   }
/*     */   
/*     */   public boolean a(double paramDouble)
/*     */   {
/*  52 */     return paramDouble < 1024.0D;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void b(sa paramsa) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean d(dh paramdh)
/*     */   {
/*  63 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void b(dh paramdh) {}
/*     */   
/*     */ 
/*     */   public void a(dh paramdh) {}
/*     */   
/*     */ 
/*     */   public boolean c(yz paramyz)
/*     */   {
/*  76 */     add localadd = paramyz.be();
/*     */     
/*  78 */     int i = 0;
/*  79 */     double d; List localList; Iterator localIterator; if ((localadd != null) && (localadd.b() == ade.ca) && 
/*  80 */       (!this.o.E))
/*     */     {
/*  82 */       d = 7.0D;
/*  83 */       localList = this.o.a(sw.class, azt.a(this.s - d, this.t - d, this.u - d, this.s + d, this.t + d, this.u + d));
/*  84 */       if (localList != null) {
/*  85 */         for (localIterator = localList.iterator(); localIterator.hasNext();) { localsw = (sw)localIterator.next();
/*  86 */           if ((localsw.bN()) && (localsw.bO() == paramyz)) {
/*  87 */             localsw.b(this, true);
/*  88 */             i = 1;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     sw localsw;
/*  94 */     if ((!this.o.E) && (i == 0)) {
/*  95 */       B();
/*     */       
/*  97 */       if (paramyz.bE.d)
/*     */       {
/*  99 */         d = 7.0D;
/* 100 */         localList = this.o.a(sw.class, azt.a(this.s - d, this.t - d, this.u - d, this.s + d, this.t + d, this.u + d));
/* 101 */         if (localList != null) {
/* 102 */           for (localIterator = localList.iterator(); localIterator.hasNext();) { localsw = (sw)localIterator.next();
/* 103 */             if ((localsw.bN()) && (localsw.bO() == this)) {
/* 104 */               localsw.a(true, false);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 110 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean e()
/*     */   {
/* 116 */     return this.o.a(this.b, this.c, this.d).b() == 11;
/*     */   }
/*     */   
/*     */   public static su a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 120 */     su localsu = new su(paramahb, paramInt1, paramInt2, paramInt3);
/* 121 */     localsu.n = true;
/* 122 */     paramahb.d(localsu);
/* 123 */     return localsu;
/*     */   }
/*     */   
/*     */   public static su b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 127 */     List localList = paramahb.a(su.class, azt.a(paramInt1 - 1.0D, paramInt2 - 1.0D, paramInt3 - 1.0D, paramInt1 + 1.0D, paramInt2 + 1.0D, paramInt3 + 1.0D));
/* 128 */     if (localList != null) {
/* 129 */       for (su localsu : localList) {
/* 130 */         if ((localsu.b == paramInt1) && (localsu.c == paramInt2) && (localsu.d == paramInt3)) {
/* 131 */           return localsu;
/*     */         }
/*     */       }
/*     */     }
/* 135 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\su.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */