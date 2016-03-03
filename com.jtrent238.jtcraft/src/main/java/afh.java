/*    */ 
/*    */ 
/*    */ 
/*    */ public class afh
/*    */   implements afg
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private add[] c;
/*    */   private add d;
/*    */   private boolean e;
/*    */   
/*    */   public afh(int paramInt1, int paramInt2, add[] paramArrayOfadd, add paramadd)
/*    */   {
/* 15 */     this.a = paramInt1;
/* 16 */     this.b = paramInt2;
/* 17 */     this.c = paramArrayOfadd;
/* 18 */     this.d = paramadd;
/*    */   }
/*    */   
/*    */   public add b()
/*    */   {
/* 23 */     return this.d;
/*    */   }
/*    */   
/*    */   public boolean a(aae paramaae, ahb paramahb)
/*    */   {
/* 28 */     for (int i = 0; i <= 3 - this.a; i++) {
/* 29 */       for (int j = 0; j <= 3 - this.b; j++) {
/* 30 */         if (a(paramaae, i, j, true)) return true;
/* 31 */         if (a(paramaae, i, j, false)) return true;
/*    */       }
/*    */     }
/* 34 */     return false;
/*    */   }
/*    */   
/*    */   private boolean a(aae paramaae, int paramInt1, int paramInt2, boolean paramBoolean) {
/* 38 */     for (int i = 0; i < 3; i++) {
/* 39 */       for (int j = 0; j < 3; j++) {
/* 40 */         int k = i - paramInt1;
/* 41 */         int m = j - paramInt2;
/* 42 */         add localadd1 = null;
/* 43 */         if ((k >= 0) && (m >= 0) && (k < this.a) && (m < this.b)) {
/* 44 */           if (paramBoolean) localadd1 = this.c[(this.a - k - 1 + m * this.a)]; else
/* 45 */             localadd1 = this.c[(k + m * this.a)];
/*    */         }
/* 47 */         add localadd2 = paramaae.b(i, j);
/* 48 */         if ((localadd2 != null) || (localadd1 != null))
/*    */         {
/*    */ 
/* 51 */           if (((localadd2 == null) && (localadd1 != null)) || ((localadd2 != null) && (localadd1 == null))) {
/* 52 */             return false;
/*    */           }
/* 54 */           if (localadd1.b() != localadd2.b()) {
/* 55 */             return false;
/*    */           }
/* 57 */           if ((localadd1.k() != 32767) && (localadd1.k() != localadd2.k()))
/* 58 */             return false;
/*    */         }
/*    */       }
/*    */     }
/* 62 */     return true;
/*    */   }
/*    */   
/*    */   public add a(aae paramaae)
/*    */   {
/* 67 */     add localadd1 = b().m();
/*    */     
/* 69 */     if (this.e) {
/* 70 */       for (int i = 0; i < paramaae.a(); i++) {
/* 71 */         add localadd2 = paramaae.a(i);
/*    */         
/* 73 */         if ((localadd2 != null) && (localadd2.p())) {
/* 74 */           localadd1.d((dh)localadd2.d.b());
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 79 */     return localadd1;
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 84 */     return this.a * this.b;
/*    */   }
/*    */   
/*    */   public afh c() {
/* 88 */     this.e = true;
/* 89 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\afh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */