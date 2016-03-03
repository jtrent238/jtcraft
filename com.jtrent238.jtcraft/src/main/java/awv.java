/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class awv
/*     */ {
/*   7 */   public static final awv[] a = new awv[64];
/*     */   
/*   9 */   public static final awv b = new awv(0, 0);
/*  10 */   public static final awv c = new awv(1, 8368696);
/*  11 */   public static final awv d = new awv(2, 16247203);
/*  12 */   public static final awv e = new awv(3, 10987431);
/*  13 */   public static final awv f = new awv(4, 16711680);
/*  14 */   public static final awv g = new awv(5, 10526975);
/*  15 */   public static final awv h = new awv(6, 10987431);
/*  16 */   public static final awv i = new awv(7, 31744);
/*  17 */   public static final awv j = new awv(8, 16777215);
/*  18 */   public static final awv k = new awv(9, 10791096);
/*  19 */   public static final awv l = new awv(10, 12020271);
/*  20 */   public static final awv m = new awv(11, 7368816);
/*  21 */   public static final awv n = new awv(12, 4210943);
/*  22 */   public static final awv o = new awv(13, 6837042);
/*  23 */   public static final awv p = new awv(14, 16776437);
/*  24 */   public static final awv q = new awv(15, 14188339);
/*  25 */   public static final awv r = new awv(16, 11685080);
/*  26 */   public static final awv s = new awv(17, 6724056);
/*  27 */   public static final awv t = new awv(18, 15066419);
/*  28 */   public static final awv u = new awv(19, 8375321);
/*  29 */   public static final awv v = new awv(20, 15892389);
/*  30 */   public static final awv w = new awv(21, 5000268);
/*  31 */   public static final awv x = new awv(22, 10066329);
/*  32 */   public static final awv y = new awv(23, 5013401);
/*  33 */   public static final awv z = new awv(24, 8339378);
/*  34 */   public static final awv A = new awv(25, 3361970);
/*  35 */   public static final awv B = new awv(26, 6704179);
/*  36 */   public static final awv C = new awv(27, 6717235);
/*  37 */   public static final awv D = new awv(28, 10040115);
/*  38 */   public static final awv E = new awv(29, 1644825);
/*  39 */   public static final awv F = new awv(30, 16445005);
/*  40 */   public static final awv G = new awv(31, 6085589);
/*  41 */   public static final awv H = new awv(32, 4882687);
/*  42 */   public static final awv I = new awv(33, 55610);
/*  43 */   public static final awv J = new awv(34, 1381407);
/*  44 */   public static final awv K = new awv(35, 7340544);
/*     */   public final int L;
/*     */   public final int M;
/*     */   
/*     */   private awv(int paramInt1, int paramInt2)
/*     */   {
/*  50 */     if ((paramInt1 < 0) || (paramInt1 > 63)) throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
/*  51 */     this.M = paramInt1;
/*  52 */     this.L = paramInt2;
/*  53 */     a[paramInt1] = this;
/*     */   }
/*     */   
/*     */   public static awv a(int paramInt) {
/*  57 */     switch (aka.c(paramInt)) {
/*     */     case 0: 
/*  59 */       return E;
/*     */     case 1: 
/*  61 */       return D;
/*     */     case 2: 
/*  63 */       return C;
/*     */     case 3: 
/*  65 */       return B;
/*     */     case 4: 
/*  67 */       return A;
/*     */     case 5: 
/*  69 */       return z;
/*     */     case 6: 
/*  71 */       return y;
/*     */     case 7: 
/*  73 */       return x;
/*     */     case 8: 
/*  75 */       return w;
/*     */     case 9: 
/*  77 */       return v;
/*     */     case 10: 
/*  79 */       return u;
/*     */     case 11: 
/*  81 */       return t;
/*     */     case 12: 
/*  83 */       return s;
/*     */     case 13: 
/*  85 */       return r;
/*     */     case 14: 
/*  87 */       return q;
/*     */     case 15: 
/*  89 */       return j;
/*     */     }
/*     */     
/*  92 */     return b;
/*     */   }
/*     */   
/*     */   public int b(int paramInt) {
/*  96 */     int i1 = 220;
/*  97 */     if (paramInt == 3) i1 = 135;
/*  98 */     if (paramInt == 2) i1 = 255;
/*  99 */     if (paramInt == 1) i1 = 220;
/* 100 */     if (paramInt == 0) { i1 = 180;
/*     */     }
/* 102 */     int i2 = (this.L >> 16 & 0xFF) * i1 / 255;
/* 103 */     int i3 = (this.L >> 8 & 0xFF) * i1 / 255;
/* 104 */     int i4 = (this.L & 0xFF) * i1 / 255;
/*     */     
/* 106 */     return 0xFF000000 | i2 << 16 | i3 << 8 | i4;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\awv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */