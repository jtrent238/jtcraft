/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.ByteOrder;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import java.nio.ShortBuffer;
/*     */ import java.util.PriorityQueue;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bmh
/*     */ {
/*     */   private ByteBuffer b;
/*     */   private IntBuffer c;
/*     */   private FloatBuffer d;
/*     */   private ShortBuffer e;
/*     */   private int[] f;
/*     */   private int g;
/*     */   private double h;
/*     */   private double i;
/*     */   private int j;
/*     */   private int k;
/*     */   private boolean l;
/*     */   private boolean m;
/*     */   private boolean n;
/*     */   private boolean o;
/*     */   private int p;
/*     */   private int q;
/*     */   private boolean r;
/*     */   private int s;
/*     */   private double t;
/*     */   private double u;
/*     */   private double v;
/*     */   private int w;
/*  36 */   public static final bmh a = new bmh(2097152);
/*     */   
/*     */   private boolean x;
/*     */   private int y;
/*     */   
/*     */   private bmh(int paramInt)
/*     */   {
/*  43 */     this.y = paramInt;
/*     */     
/*  45 */     this.b = ban.c(paramInt * 4);
/*  46 */     this.c = this.b.asIntBuffer();
/*  47 */     this.d = this.b.asFloatBuffer();
/*  48 */     this.e = this.b.asShortBuffer();
/*  49 */     this.f = new int[paramInt];
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  54 */     if (!this.x) throw new IllegalStateException("Not tesselating!");
/*  55 */     this.x = false;
/*  56 */     if (this.g > 0) {
/*  57 */       this.c.clear();
/*  58 */       this.c.put(this.f, 0, this.p);
/*     */       
/*  60 */       this.b.position(0);
/*  61 */       this.b.limit(this.p * 4);
/*     */       
/*     */ 
/*     */ 
/*  65 */       if (this.m) {
/*  66 */         this.d.position(3);
/*  67 */         GL11.glTexCoordPointer(2, 32, this.d);
/*  68 */         GL11.glEnableClientState(32888);
/*     */       }
/*  70 */       if (this.n) {
/*  71 */         buu.k(buu.c);
/*     */         
/*  73 */         this.e.position(14);
/*  74 */         GL11.glTexCoordPointer(2, 32, this.e);
/*  75 */         GL11.glEnableClientState(32888);
/*  76 */         buu.k(buu.b);
/*     */       }
/*  78 */       if (this.l) {
/*  79 */         this.b.position(20);
/*  80 */         GL11.glColorPointer(4, true, 32, this.b);
/*  81 */         GL11.glEnableClientState(32886);
/*     */       }
/*  83 */       if (this.o) {
/*  84 */         this.b.position(24);
/*  85 */         GL11.glNormalPointer(32, this.b);
/*  86 */         GL11.glEnableClientState(32885);
/*     */       }
/*  88 */       this.d.position(0);
/*  89 */       GL11.glVertexPointer(3, 32, this.d);
/*  90 */       GL11.glEnableClientState(32884);
/*  91 */       GL11.glDrawArrays(this.s, 0, this.g);
/*     */       
/*  93 */       GL11.glDisableClientState(32884);
/*  94 */       if (this.m) GL11.glDisableClientState(32888);
/*  95 */       if (this.n) {
/*  96 */         buu.k(buu.c);
/*  97 */         GL11.glDisableClientState(32888);
/*  98 */         buu.k(buu.b);
/*     */       }
/* 100 */       if (this.l) GL11.glDisableClientState(32886);
/* 101 */       if (this.o) { GL11.glDisableClientState(32885);
/*     */       }
/*     */     }
/* 104 */     int i1 = this.p * 4;
/* 105 */     d();
/*     */     
/* 107 */     return i1;
/*     */   }
/*     */   
/*     */   public bmi a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 111 */     int[] arrayOfInt = new int[this.p];
/* 112 */     PriorityQueue localPriorityQueue = new PriorityQueue(this.p, new bme(this.f, paramFloat1 + (float)this.t, paramFloat2 + (float)this.u, paramFloat3 + (float)this.v));
/*     */     
/* 114 */     int i1 = 32;
/*     */     
/* 116 */     for (int i2 = 0; i2 < this.p; i2 += i1) {
/* 117 */       localPriorityQueue.add(Integer.valueOf(i2));
/*     */     }
/*     */     
/* 120 */     i2 = 0;
/* 121 */     while (!localPriorityQueue.isEmpty()) {
/* 122 */       int i3 = ((Integer)localPriorityQueue.remove()).intValue();
/* 123 */       for (int i4 = 0; i4 < i1; i4++) {
/* 124 */         arrayOfInt[(i2 + i4)] = this.f[(i3 + i4)];
/*     */       }
/* 126 */       i2 += i1;
/*     */     }
/*     */     
/* 129 */     System.arraycopy(arrayOfInt, 0, this.f, 0, arrayOfInt.length);
/*     */     
/* 131 */     return new bmi(arrayOfInt, this.p, this.g, this.m, this.n, this.o, this.l);
/*     */   }
/*     */   
/*     */   public void a(bmi parambmi) {
/* 135 */     System.arraycopy(parambmi.a(), 0, this.f, 0, parambmi.a().length);
/*     */     
/* 137 */     this.p = parambmi.b();
/* 138 */     this.g = parambmi.c();
/* 139 */     this.m = parambmi.d();
/* 140 */     this.n = parambmi.e();
/* 141 */     this.l = parambmi.g();
/* 142 */     this.o = parambmi.f();
/*     */   }
/*     */   
/*     */   private void d() {
/* 146 */     this.g = 0;
/*     */     
/* 148 */     this.b.clear();
/* 149 */     this.p = 0;
/* 150 */     this.q = 0;
/*     */   }
/*     */   
/*     */   public void b() {
/* 154 */     a(7);
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 158 */     if (this.x) {
/* 159 */       throw new IllegalStateException("Already tesselating!");
/*     */     }
/* 161 */     this.x = true;
/*     */     
/* 163 */     d();
/* 164 */     this.s = paramInt;
/* 165 */     this.o = false;
/* 166 */     this.l = false;
/* 167 */     this.m = false;
/* 168 */     this.n = false;
/* 169 */     this.r = false;
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2) {
/* 173 */     this.m = true;
/* 174 */     this.h = paramDouble1;
/* 175 */     this.i = paramDouble2;
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 179 */     this.n = true;
/* 180 */     this.j = paramInt;
/*     */   }
/*     */   
/*     */   public void b(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 184 */     a((int)(paramFloat1 * 255.0F), (int)(paramFloat2 * 255.0F), (int)(paramFloat3 * 255.0F));
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 188 */     a((int)(paramFloat1 * 255.0F), (int)(paramFloat2 * 255.0F), (int)(paramFloat3 * 255.0F), (int)(paramFloat4 * 255.0F));
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/* 192 */     a(paramInt1, paramInt2, paramInt3, 255);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 196 */     if (this.r) { return;
/*     */     }
/* 198 */     if (paramInt1 > 255) paramInt1 = 255;
/* 199 */     if (paramInt2 > 255) paramInt2 = 255;
/* 200 */     if (paramInt3 > 255) paramInt3 = 255;
/* 201 */     if (paramInt4 > 255) paramInt4 = 255;
/* 202 */     if (paramInt1 < 0) paramInt1 = 0;
/* 203 */     if (paramInt2 < 0) paramInt2 = 0;
/* 204 */     if (paramInt3 < 0) paramInt3 = 0;
/* 205 */     if (paramInt4 < 0) { paramInt4 = 0;
/*     */     }
/* 207 */     this.l = true;
/* 208 */     if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
/* 209 */       this.k = (paramInt4 << 24 | paramInt3 << 16 | paramInt2 << 8 | paramInt1);
/*     */     } else {
/* 211 */       this.k = (paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8 | paramInt4);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(byte paramByte1, byte paramByte2, byte paramByte3) {
/* 216 */     a(paramByte1 & 0xFF, paramByte2 & 0xFF, paramByte3 & 0xFF);
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5) {
/* 220 */     a(paramDouble4, paramDouble5);
/* 221 */     a(paramDouble1, paramDouble2, paramDouble3);
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 225 */     this.q += 1;
/*     */     
/* 227 */     if (this.m) {
/* 228 */       this.f[(this.p + 3)] = Float.floatToRawIntBits((float)this.h);
/* 229 */       this.f[(this.p + 4)] = Float.floatToRawIntBits((float)this.i);
/*     */     }
/* 231 */     if (this.n) {
/* 232 */       this.f[(this.p + 7)] = this.j;
/*     */     }
/* 234 */     if (this.l) {
/* 235 */       this.f[(this.p + 5)] = this.k;
/*     */     }
/* 237 */     if (this.o) {
/* 238 */       this.f[(this.p + 6)] = this.w;
/*     */     }
/*     */     
/* 241 */     this.f[(this.p + 0)] = Float.floatToRawIntBits((float)(paramDouble1 + this.t));
/* 242 */     this.f[(this.p + 1)] = Float.floatToRawIntBits((float)(paramDouble2 + this.u));
/* 243 */     this.f[(this.p + 2)] = Float.floatToRawIntBits((float)(paramDouble3 + this.v));
/*     */     
/* 245 */     this.p += 8;
/*     */     
/* 247 */     this.g += 1;
/* 248 */     if ((this.g % 4 == 0) && (this.p >= this.y - 32)) {
/* 249 */       a();
/* 250 */       this.x = true;
/*     */     }
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/* 255 */     int i1 = paramInt >> 16 & 0xFF;
/* 256 */     int i2 = paramInt >> 8 & 0xFF;
/* 257 */     int i3 = paramInt & 0xFF;
/* 258 */     a(i1, i2, i3);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2) {
/* 262 */     int i1 = paramInt1 >> 16 & 0xFF;
/* 263 */     int i2 = paramInt1 >> 8 & 0xFF;
/* 264 */     int i3 = paramInt1 & 0xFF;
/* 265 */     a(i1, i2, i3, paramInt2);
/*     */   }
/*     */   
/*     */   public void c() {
/* 269 */     this.r = true;
/*     */   }
/*     */   
/*     */   public void c(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 273 */     this.o = true;
/* 274 */     int i1 = (byte)(int)(paramFloat1 * 127.0F);
/* 275 */     int i2 = (byte)(int)(paramFloat2 * 127.0F);
/* 276 */     int i3 = (byte)(int)(paramFloat3 * 127.0F);
/*     */     
/* 278 */     this.w = (i1 & 0xFF | (i2 & 0xFF) << 8 | (i3 & 0xFF) << 16);
/*     */   }
/*     */   
/*     */   public void b(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 282 */     this.t = paramDouble1;
/* 283 */     this.u = paramDouble2;
/* 284 */     this.v = paramDouble3;
/*     */   }
/*     */   
/*     */   public void d(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 288 */     this.t += paramFloat1;
/* 289 */     this.u += paramFloat2;
/* 290 */     this.v += paramFloat3;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */