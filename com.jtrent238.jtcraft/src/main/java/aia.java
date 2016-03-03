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
/*     */ public class aia
/*     */ {
/*     */   protected ahb a;
/*     */   protected Random b;
/*     */   protected int c;
/*     */   protected int d;
/*     */   
/*     */   public void a(ahb paramahb, Random paramRandom, ahu paramahu, int paramInt1, int paramInt2)
/*     */   {
/*  21 */     if (this.a != null) throw new RuntimeException("Already decorating!!");
/*  22 */     this.a = paramahb;
/*  23 */     this.b = paramRandom;
/*  24 */     this.c = paramInt1;
/*  25 */     this.d = paramInt2;
/*     */     
/*  27 */     a(paramahu);
/*     */     
/*  29 */     this.a = null;
/*  30 */     this.b = null;
/*     */   }
/*     */   
/*  33 */   protected arn e = new arj(4);
/*  34 */   protected arn f = new asj(ajn.m, 7);
/*  35 */   protected arn g = new asj(ajn.n, 6);
/*  36 */   protected arn h = new ase(ajn.d, 32);
/*  37 */   protected arn i = new ase(ajn.n, 32);
/*  38 */   protected arn j = new ase(ajn.q, 16);
/*  39 */   protected arn k = new ase(ajn.p, 8);
/*  40 */   protected arn l = new ase(ajn.o, 8);
/*  41 */   protected arn m = new ase(ajn.ax, 7);
/*  42 */   protected arn n = new ase(ajn.ag, 7);
/*  43 */   protected arn o = new ase(ajn.x, 6);
/*  44 */   protected aro p = new aro(ajn.N);
/*  45 */   protected arn q = new aro(ajn.P);
/*  46 */   protected arn r = new aro(ajn.Q);
/*  47 */   protected arn s = new aru();
/*  48 */   protected arn t = new ash();
/*  49 */   protected arn u = new arh();
/*  50 */   protected arn v = new aiz();
/*     */   
/*     */   protected int w;
/*     */   protected int x;
/*  54 */   protected int y = 2;
/*  55 */   protected int z = 1;
/*     */   protected int A;
/*     */   protected int B;
/*     */   protected int C;
/*     */   protected int D;
/*  60 */   protected int E = 1;
/*  61 */   protected int F = 3;
/*  62 */   protected int G = 1;
/*     */   protected int H;
/*  64 */   public boolean I = true;
/*     */   
/*     */   protected void a(ahu paramahu) {
/*  67 */     a();
/*     */     int i3;
/*  69 */     for (int i1 = 0; i1 < this.F; i1++) {
/*  70 */       i2 = this.c + this.b.nextInt(16) + 8;
/*  71 */       i3 = this.d + this.b.nextInt(16) + 8;
/*  72 */       this.f.a(this.a, this.b, i2, this.a.i(i2, i3), i3);
/*     */     }
/*     */     
/*  75 */     for (i1 = 0; i1 < this.G; i1++) {
/*  76 */       i2 = this.c + this.b.nextInt(16) + 8;
/*  77 */       i3 = this.d + this.b.nextInt(16) + 8;
/*  78 */       this.e.a(this.a, this.b, i2, this.a.i(i2, i3), i3);
/*     */     }
/*     */     
/*  81 */     for (i1 = 0; i1 < this.E; i1++) {
/*  82 */       i2 = this.c + this.b.nextInt(16) + 8;
/*  83 */       i3 = this.d + this.b.nextInt(16) + 8;
/*  84 */       this.g.a(this.a, this.b, i2, this.a.i(i2, i3), i3);
/*     */     }
/*     */     
/*  87 */     i1 = this.x;
/*  88 */     if (this.b.nextInt(10) == 0) i1++;
/*     */     int i4;
/*  90 */     int i5; Object localObject; for (int i2 = 0; i2 < i1; i2++) {
/*  91 */       i3 = this.c + this.b.nextInt(16) + 8;
/*  92 */       i4 = this.d + this.b.nextInt(16) + 8;
/*  93 */       i5 = this.a.f(i3, i4);
/*  94 */       localObject = paramahu.a(this.b);
/*  95 */       ((arc)localObject).a(1.0D, 1.0D, 1.0D);
/*  96 */       if (((arc)localObject).a(this.a, this.b, i3, i5, i4)) {
/*  97 */         ((arc)localObject).b(this.a, this.b, i3, i5, i4);
/*     */       }
/*     */     }
/*     */     
/* 101 */     for (i2 = 0; i2 < this.H; i2++) {
/* 102 */       i3 = this.c + this.b.nextInt(16) + 8;
/* 103 */       i4 = this.d + this.b.nextInt(16) + 8;
/* 104 */       this.s.a(this.a, this.b, i3, this.a.f(i3, i4), i4);
/*     */     }
/*     */     
/* 107 */     for (i2 = 0; i2 < this.y; i2++) {
/* 108 */       i3 = this.c + this.b.nextInt(16) + 8;
/* 109 */       i4 = this.d + this.b.nextInt(16) + 8;
/* 110 */       i5 = this.b.nextInt(this.a.f(i3, i4) + 32);
/* 111 */       localObject = paramahu.a(this.b, i3, i5, i4);
/* 112 */       alc localalc = alc.e((String)localObject);
/* 113 */       if (localalc.o() != awt.a) {
/* 114 */         this.p.a(localalc, alc.f((String)localObject));
/* 115 */         this.p.a(this.a, this.b, i3, i5, i4);
/*     */       }
/*     */     }
/*     */     
/* 119 */     for (i2 = 0; i2 < this.z; i2++) {
/* 120 */       i3 = this.c + this.b.nextInt(16) + 8;
/* 121 */       i4 = this.d + this.b.nextInt(16) + 8;
/* 122 */       i5 = this.b.nextInt(this.a.f(i3, i4) * 2);
/* 123 */       localObject = paramahu.b(this.b);
/* 124 */       ((arn)localObject).a(this.a, this.b, i3, i5, i4);
/*     */     }
/*     */     
/* 127 */     for (i2 = 0; i2 < this.A; i2++) {
/* 128 */       i3 = this.c + this.b.nextInt(16) + 8;
/* 129 */       i4 = this.d + this.b.nextInt(16) + 8;
/* 130 */       i5 = this.b.nextInt(this.a.f(i3, i4) * 2);
/* 131 */       new ark(ajn.I).a(this.a, this.b, i3, i5, i4);
/*     */     }
/*     */     
/* 134 */     for (i2 = 0; i2 < this.w; i2++) {
/* 135 */       i3 = this.c + this.b.nextInt(16) + 8;
/* 136 */       i4 = this.d + this.b.nextInt(16) + 8;
/* 137 */       i5 = this.b.nextInt(this.a.f(i3, i4) * 2);
/* 138 */       while ((i5 > 0) && (this.a.c(i3, i5 - 1, i4)))
/* 139 */         i5--;
/* 140 */       this.v.a(this.a, this.b, i3, i5, i4);
/*     */     }
/*     */     
/* 143 */     for (i2 = 0; i2 < this.B; i2++) {
/* 144 */       if (this.b.nextInt(4) == 0) {
/* 145 */         i3 = this.c + this.b.nextInt(16) + 8;
/* 146 */         i4 = this.d + this.b.nextInt(16) + 8;
/* 147 */         i5 = this.a.f(i3, i4);
/* 148 */         this.q.a(this.a, this.b, i3, i5, i4);
/*     */       }
/*     */       
/* 151 */       if (this.b.nextInt(8) == 0) {
/* 152 */         i3 = this.c + this.b.nextInt(16) + 8;
/* 153 */         i4 = this.d + this.b.nextInt(16) + 8;
/* 154 */         i5 = this.b.nextInt(this.a.f(i3, i4) * 2);
/* 155 */         this.r.a(this.a, this.b, i3, i5, i4);
/*     */       }
/*     */     }
/*     */     
/* 159 */     if (this.b.nextInt(4) == 0) {
/* 160 */       i2 = this.c + this.b.nextInt(16) + 8;
/* 161 */       i3 = this.d + this.b.nextInt(16) + 8;
/* 162 */       i4 = this.b.nextInt(this.a.f(i2, i3) * 2);
/* 163 */       this.q.a(this.a, this.b, i2, i4, i3);
/*     */     }
/*     */     
/* 166 */     if (this.b.nextInt(8) == 0) {
/* 167 */       i2 = this.c + this.b.nextInt(16) + 8;
/* 168 */       i3 = this.d + this.b.nextInt(16) + 8;
/* 169 */       i4 = this.b.nextInt(this.a.f(i2, i3) * 2);
/* 170 */       this.r.a(this.a, this.b, i2, i4, i3);
/*     */     }
/*     */     
/* 173 */     for (i2 = 0; i2 < this.C; i2++) {
/* 174 */       i3 = this.c + this.b.nextInt(16) + 8;
/* 175 */       i4 = this.d + this.b.nextInt(16) + 8;
/* 176 */       i5 = this.b.nextInt(this.a.f(i3, i4) * 2);
/* 177 */       this.t.a(this.a, this.b, i3, i5, i4);
/*     */     }
/*     */     
/* 180 */     for (i2 = 0; i2 < 10; i2++) {
/* 181 */       i3 = this.c + this.b.nextInt(16) + 8;
/* 182 */       i4 = this.d + this.b.nextInt(16) + 8;
/* 183 */       i5 = this.b.nextInt(this.a.f(i3, i4) * 2);
/* 184 */       this.t.a(this.a, this.b, i3, i5, i4);
/*     */     }
/*     */     
/* 187 */     if (this.b.nextInt(32) == 0) {
/* 188 */       i2 = this.c + this.b.nextInt(16) + 8;
/* 189 */       i3 = this.d + this.b.nextInt(16) + 8;
/* 190 */       i4 = this.b.nextInt(this.a.f(i2, i3) * 2);
/* 191 */       new asg().a(this.a, this.b, i2, i4, i3);
/*     */     }
/*     */     
/* 194 */     for (i2 = 0; i2 < this.D; i2++) {
/* 195 */       i3 = this.c + this.b.nextInt(16) + 8;
/* 196 */       i4 = this.d + this.b.nextInt(16) + 8;
/* 197 */       i5 = this.b.nextInt(this.a.f(i3, i4) * 2);
/* 198 */       this.u.a(this.a, this.b, i3, i5, i4);
/*     */     }
/*     */     
/* 201 */     if (this.I) {
/* 202 */       for (i2 = 0; i2 < 50; i2++) {
/* 203 */         i3 = this.c + this.b.nextInt(16) + 8;
/* 204 */         i4 = this.b.nextInt(this.b.nextInt(248) + 8);
/* 205 */         i5 = this.d + this.b.nextInt(16) + 8;
/* 206 */         new asm(ajn.i).a(this.a, this.b, i3, i4, i5);
/*     */       }
/*     */       
/* 209 */       for (i2 = 0; i2 < 20; i2++) {
/* 210 */         i3 = this.c + this.b.nextInt(16) + 8;
/* 211 */         i4 = this.b.nextInt(this.b.nextInt(this.b.nextInt(240) + 8) + 8);
/* 212 */         i5 = this.d + this.b.nextInt(16) + 8;
/* 213 */         new asm(ajn.k).a(this.a, this.b, i3, i4, i5);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void a(int paramInt1, arn paramarn, int paramInt2, int paramInt3)
/*     */   {
/* 223 */     for (int i1 = 0; i1 < paramInt1; i1++) {
/* 224 */       int i2 = this.c + this.b.nextInt(16);
/* 225 */       int i3 = this.b.nextInt(paramInt3 - paramInt2) + paramInt2;
/* 226 */       int i4 = this.d + this.b.nextInt(16);
/* 227 */       paramarn.a(this.a, this.b, i2, i3, i4);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, arn paramarn, int paramInt2, int paramInt3) {
/* 232 */     for (int i1 = 0; i1 < paramInt1; i1++) {
/* 233 */       int i2 = this.c + this.b.nextInt(16);
/* 234 */       int i3 = this.b.nextInt(paramInt3) + this.b.nextInt(paramInt3) + (paramInt2 - paramInt3);
/* 235 */       int i4 = this.d + this.b.nextInt(16);
/* 236 */       paramarn.a(this.a, this.b, i2, i3, i4);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a() {
/* 241 */     a(20, this.h, 0, 256);
/* 242 */     a(10, this.i, 0, 256);
/* 243 */     a(20, this.j, 0, 128);
/* 244 */     a(20, this.k, 0, 64);
/* 245 */     a(2, this.l, 0, 32);
/* 246 */     a(8, this.m, 0, 16);
/* 247 */     a(1, this.n, 0, 16);
/* 248 */     b(1, this.o, 16, 16);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */