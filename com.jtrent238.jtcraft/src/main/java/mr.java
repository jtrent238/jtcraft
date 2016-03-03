/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class mr
/*     */ {
/*  24 */   private final List b = new ArrayList();
/*     */   
/*     */   private final agu c;
/*  27 */   private short[] d = new short[64];
/*     */   private int e;
/*     */   private int f;
/*     */   private long g;
/*     */   
/*     */   public mr(mq parammq, int paramInt1, int paramInt2) {
/*  33 */     this.c = new agu(paramInt1, paramInt2);
/*  34 */     parammq.a().b.c(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public void a(mw parammw) {
/*  38 */     if (this.b.contains(parammw)) {
/*  39 */       mq.c().debug("Failed to add player. {} already is in chunk {}, {}", new Object[] { parammw, Integer.valueOf(this.c.a), Integer.valueOf(this.c.b) });
/*  40 */       return;
/*     */     }
/*     */     
/*  43 */     if (this.b.isEmpty()) {
/*  44 */       this.g = mq.a(this.a).I();
/*     */     }
/*     */     
/*  47 */     this.b.add(parammw);
/*  48 */     parammw.f.add(this.c);
/*     */   }
/*     */   
/*     */   public void b(mw parammw) {
/*  52 */     if (!this.b.contains(parammw)) {
/*  53 */       return;
/*     */     }
/*     */     
/*  56 */     apx localapx = mq.a(this.a).e(this.c.a, this.c.b);
/*  57 */     if (localapx.k()) {
/*  58 */       parammw.a.a(new gx(localapx, true, 0));
/*     */     }
/*  60 */     this.b.remove(parammw);
/*  61 */     parammw.f.remove(this.c);
/*     */     
/*  63 */     if (this.b.isEmpty()) {
/*  64 */       long l = this.c.a + 2147483647L | this.c.b + 2147483647L << 32;
/*  65 */       a(localapx);
/*  66 */       mq.b(this.a).d(l);
/*  67 */       mq.c(this.a).remove(this);
/*  68 */       if (this.e > 0) {
/*  69 */         mq.d(this.a).remove(this);
/*     */       }
/*  71 */       this.a.a().b.b(this.c.a, this.c.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/*  76 */     a(mq.a(this.a).e(this.c.a, this.c.b));
/*     */   }
/*     */   
/*     */   private void a(apx paramapx) {
/*  80 */     paramapx.s += mq.a(this.a).I() - this.g;
/*     */     
/*  82 */     this.g = mq.a(this.a).I();
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/*  86 */     if (this.e == 0) {
/*  87 */       mq.d(this.a).add(this);
/*     */     }
/*  89 */     this.f |= 1 << (paramInt2 >> 4);
/*     */     
/*  91 */     if (this.e < 64) {
/*  92 */       int i = (short)(paramInt1 << 12 | paramInt3 << 8 | paramInt2);
/*     */       
/*  94 */       for (int j = 0; j < this.e; j++) {
/*  95 */         if (this.d[j] == i) { return;
/*     */         }
/*     */       }
/*  98 */       this.d[(this.e++)] = i;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ft paramft) {
/* 103 */     for (int i = 0; i < this.b.size(); i++) {
/* 104 */       mw localmw = (mw)this.b.get(i);
/* 105 */       if (!localmw.f.contains(this.c)) {
/* 106 */         localmw.a.a(paramft);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/* 112 */     if (this.e == 0) return;
/*     */     int i;
/* 114 */     int j; int k; if (this.e == 1) {
/* 115 */       i = this.c.a * 16 + (this.d[0] >> 12 & 0xF);
/* 116 */       j = this.d[0] & 0xFF;
/* 117 */       k = this.c.b * 16 + (this.d[0] >> 8 & 0xF);
/*     */       
/* 119 */       a(new gh(i, j, k, mq.a(this.a)));
/* 120 */       if (mq.a(this.a).a(i, j, k).u())
/* 121 */         a(mq.a(this.a).o(i, j, k));
/*     */     } else { int m;
/* 123 */       if (this.e == 64) {
/* 124 */         i = this.c.a * 16;
/* 125 */         j = this.c.b * 16;
/*     */         
/* 127 */         a(new gx(mq.a(this.a).e(this.c.a, this.c.b), false, this.f));
/*     */         
/* 129 */         for (k = 0; k < 16; k++) {
/* 130 */           if ((this.f & 1 << k) != 0) {
/* 131 */             m = k << 4;
/* 132 */             List localList = mq.a(this.a).a(i, m, j, i + 16, m + 16, j + 16);
/* 133 */             for (int n = 0; n < localList.size(); n++) {
/* 134 */               a((aor)localList.get(n));
/*     */             }
/*     */           }
/*     */         }
/*     */       } else {
/* 139 */         a(new gk(this.e, this.d, mq.a(this.a).e(this.c.a, this.c.b)));
/*     */         
/* 141 */         for (i = 0; i < this.e; i++) {
/* 142 */           j = this.c.a * 16 + (this.d[i] >> 12 & 0xF);
/* 143 */           k = this.d[i] & 0xFF;
/* 144 */           m = this.c.b * 16 + (this.d[i] >> 8 & 0xF);
/*     */           
/* 146 */           if (mq.a(this.a).a(j, k, m).u())
/* 147 */             a(mq.a(this.a).o(j, k, m));
/*     */         }
/*     */       }
/*     */     }
/* 151 */     this.e = 0;
/* 152 */     this.f = 0;
/*     */   }
/*     */   
/*     */   private void a(aor paramaor) {
/* 156 */     if (paramaor != null) {
/* 157 */       ft localft = paramaor.m();
/* 158 */       if (localft != null) {
/* 159 */         a(localft);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\mr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */