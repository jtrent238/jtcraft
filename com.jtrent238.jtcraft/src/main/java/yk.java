/*     */ import java.util.Random;
/*     */ import org.apache.commons.lang3.tuple.ImmutablePair;
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
/*     */ public class yk
/*     */   extends yg
/*     */ {
/*     */   private int bp;
/*     */   
/*     */   public yk(ahb paramahb)
/*     */   {
/*  21 */     super(paramahb);
/*  22 */     a(0.3F, 0.7F);
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  27 */     super.aD();
/*     */     
/*  29 */     a(yj.a).a(8.0D);
/*  30 */     a(yj.d).a(0.6000000238418579D);
/*  31 */     a(yj.e).a(1.0D);
/*     */   }
/*     */   
/*     */   protected boolean g_()
/*     */   {
/*  36 */     return false;
/*     */   }
/*     */   
/*     */   protected sa bR()
/*     */   {
/*  41 */     double d = 8.0D;
/*  42 */     return this.o.b(this, d);
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/*  47 */     return "mob.silverfish.say";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/*  52 */     return "mob.silverfish.hit";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/*  57 */     return "mob.silverfish.kill";
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/*  62 */     if (aw()) return false;
/*  63 */     if ((this.bp <= 0) && (((paramro instanceof rp)) || (paramro == ro.k)))
/*     */     {
/*  65 */       this.bp = 20;
/*     */     }
/*  67 */     return super.a(paramro, paramFloat);
/*     */   }
/*     */   
/*     */   protected void a(sa paramsa, float paramFloat)
/*     */   {
/*  72 */     if ((this.aB <= 0) && (paramFloat < 1.2F) && (paramsa.C.e > this.C.b) && (paramsa.C.b < this.C.e)) {
/*  73 */       this.aB = 20;
/*  74 */       n(paramsa);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  80 */     a("mob.silverfish.step", 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/*  85 */     return adb.d(0);
/*     */   }
/*     */   
/*     */ 
/*     */   public void h()
/*     */   {
/*  91 */     this.aM = this.y;
/*     */     
/*  93 */     super.h();
/*     */   }
/*     */   
/*     */   protected void bq()
/*     */   {
/*  98 */     super.bq();
/*     */     
/* 100 */     if (this.o.E) return;
/*     */     int i;
/*     */     int j;
/*     */     int k;
/* 104 */     int m; int i1; if (this.bp > 0) {
/* 105 */       this.bp -= 1;
/* 106 */       if (this.bp == 0)
/*     */       {
/*     */ 
/* 109 */         i = qh.c(this.s);
/* 110 */         j = qh.c(this.t);
/* 111 */         k = qh.c(this.u);
/* 112 */         m = 0;
/*     */         
/* 114 */         for (int n = 0; (m == 0) && (n <= 5) && (n >= -5); n = n <= 0 ? 1 - n : 0 - n) {
/* 115 */           for (i1 = 0; (m == 0) && (i1 <= 10) && (i1 >= -10); i1 = i1 <= 0 ? 1 - i1 : 0 - i1) {
/* 116 */             for (int i2 = 0; (m == 0) && (i2 <= 10) && (i2 >= -10); i2 = i2 <= 0 ? 1 - i2 : 0 - i2) {
/* 117 */               if (this.o.a(i + i1, j + n, k + i2) == ajn.aU) {
/* 118 */                 if (!this.o.O().b("mobGriefing")) {
/* 119 */                   int i3 = this.o.e(i + i1, j + n, k + i2);
/* 120 */                   ImmutablePair localImmutablePair = amb.b(i3);
/*     */                   
/* 122 */                   this.o.d(i + i1, j + n, k + i2, (aji)localImmutablePair.getLeft(), ((Integer)localImmutablePair.getRight()).intValue(), 3);
/*     */                 } else {
/* 124 */                   this.o.a(i + i1, j + n, k + i2, false);
/*     */                 }
/* 126 */                 ajn.aU.b(this.o, i + i1, j + n, k + i2, 0);
/* 127 */                 if (this.Z.nextBoolean()) {
/* 128 */                   m = 1;
/* 129 */                   break;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 138 */     if ((this.bm == null) && (!bS()))
/*     */     {
/*     */ 
/* 141 */       i = qh.c(this.s);
/* 142 */       j = qh.c(this.t + 0.5D);
/* 143 */       k = qh.c(this.u);
/* 144 */       m = this.Z.nextInt(6);
/*     */       
/* 146 */       aji localaji = this.o.a(i + q.b[m], j + q.c[m], k + q.d[m]);
/* 147 */       i1 = this.o.e(i + q.b[m], j + q.c[m], k + q.d[m]);
/* 148 */       if (amb.a(localaji)) {
/* 149 */         this.o.d(i + q.b[m], j + q.c[m], k + q.d[m], ajn.aU, amb.a(localaji, i1), 3);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */         s();
/* 158 */         B();
/*     */       } else {
/* 160 */         bQ();
/*     */       }
/*     */     }
/* 163 */     else if ((this.bm != null) && (!bS())) {
/* 164 */       this.bm = null;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public float a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 171 */     if (this.o.a(paramInt1, paramInt2 - 1, paramInt3) == ajn.b) return 10.0F;
/* 172 */     return super.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   protected boolean j_()
/*     */   {
/* 177 */     return true;
/*     */   }
/*     */   
/*     */   public boolean by()
/*     */   {
/* 182 */     if (super.by()) {
/* 183 */       yz localyz = this.o.a(this, 5.0D);
/* 184 */       return localyz == null;
/*     */     }
/* 186 */     return false;
/*     */   }
/*     */   
/*     */   public sz bd()
/*     */   {
/* 191 */     return sz.c;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\yk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */