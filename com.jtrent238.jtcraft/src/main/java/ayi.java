/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class ayi
/*     */   extends ayl
/*     */ {
/*     */   public int a;
/*     */   public int b;
/*     */   public byte c;
/*     */   public byte d;
/* 115 */   public byte[] e = new byte['䀀'];
/* 116 */   public List f = new ArrayList();
/* 117 */   private Map i = new HashMap();
/* 118 */   public Map g = new LinkedHashMap();
/*     */   
/*     */   public ayi(String paramString) {
/* 121 */     super(paramString);
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 126 */     this.c = paramdh.d("dimension");
/* 127 */     this.a = paramdh.f("xCenter");
/* 128 */     this.b = paramdh.f("zCenter");
/* 129 */     this.d = paramdh.d("scale");
/* 130 */     if (this.d < 0) this.d = 0;
/* 131 */     if (this.d > 4) { this.d = 4;
/*     */     }
/* 133 */     int j = paramdh.e("width");
/* 134 */     int k = paramdh.e("height");
/* 135 */     if ((j == 128) && (k == 128)) {
/* 136 */       this.e = paramdh.k("colors");
/*     */     } else {
/* 138 */       byte[] arrayOfByte = paramdh.k("colors");
/* 139 */       this.e = new byte['䀀'];
/* 140 */       int m = (128 - j) / 2;
/* 141 */       int n = (128 - k) / 2;
/* 142 */       for (int i1 = 0; i1 < k; i1++) {
/* 143 */         int i2 = i1 + n;
/* 144 */         if ((i2 >= 0) || (i2 < 128)) {
/* 145 */           for (int i3 = 0; i3 < j; i3++) {
/* 146 */             int i4 = i3 + m;
/* 147 */             if ((i4 >= 0) || (i4 < 128))
/* 148 */               this.e[(i4 + i2 * 128)] = arrayOfByte[(i3 + i1 * j)];
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(dh paramdh) {
/* 156 */     paramdh.a("dimension", this.c);
/* 157 */     paramdh.a("xCenter", this.a);
/* 158 */     paramdh.a("zCenter", this.b);
/* 159 */     paramdh.a("scale", this.d);
/* 160 */     paramdh.a("width", (short)128);
/* 161 */     paramdh.a("height", (short)128);
/* 162 */     paramdh.a("colors", this.e);
/*     */   }
/*     */   
/*     */   public void a(yz paramyz, add paramadd) {
/* 166 */     if (!this.i.containsKey(paramyz)) {
/* 167 */       ayj localayj1 = new ayj(this, paramyz);
/* 168 */       this.i.put(paramyz, localayj1);
/* 169 */       this.f.add(localayj1);
/*     */     }
/*     */     
/* 172 */     if (!paramyz.bm.c(paramadd)) {
/* 173 */       this.g.remove(paramyz.b_());
/*     */     }
/*     */     
/* 176 */     for (int j = 0; j < this.f.size(); j++) {
/* 177 */       ayj localayj2 = (ayj)this.f.get(j);
/*     */       
/* 179 */       if ((localayj2.a.K) || ((!localayj2.a.bm.c(paramadd)) && (!paramadd.A()))) {
/* 180 */         this.i.remove(localayj2.a);
/* 181 */         this.f.remove(localayj2);
/* 182 */       } else if ((!paramadd.A()) && (localayj2.a.ap == this.c)) {
/* 183 */         a(0, localayj2.a.o, localayj2.a.b_(), localayj2.a.s, localayj2.a.u, localayj2.a.y);
/*     */       }
/*     */     }
/*     */     
/* 187 */     if (paramadd.A()) {
/* 188 */       a(1, paramyz.o, "frame-" + paramadd.B().y(), paramadd.B().b, paramadd.B().d, paramadd.B().a * 90);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(int paramInt, ahb paramahb, String paramString, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 193 */     int j = 1 << this.d;
/* 194 */     float f1 = (float)(paramDouble1 - this.a) / j;
/* 195 */     float f2 = (float)(paramDouble2 - this.b) / j;
/* 196 */     byte b1 = (byte)(int)(f1 * 2.0F + 0.5D);
/* 197 */     byte b2 = (byte)(int)(f2 * 2.0F + 0.5D);
/*     */     
/* 199 */     int k = 63;
/*     */     byte b3;
/* 201 */     if ((f1 >= -k) && (f2 >= -k) && (f1 <= k) && (f2 <= k)) {
/* 202 */       paramDouble3 += (paramDouble3 < 0.0D ? -8.0D : 8.0D);
/* 203 */       b3 = (byte)(int)(paramDouble3 * 16.0D / 360.0D);
/*     */       
/* 205 */       if (this.c < 0) {
/* 206 */         int m = (int)(paramahb.N().g() / 10L);
/* 207 */         b3 = (byte)(m * m * 34187121 + m * 121 >> 15 & 0xF);
/*     */       }
/* 209 */     } else if ((Math.abs(f1) < 320.0F) && (Math.abs(f2) < 320.0F)) {
/* 210 */       paramInt = 6;
/* 211 */       b3 = 0;
/* 212 */       if (f1 <= -k) b1 = (byte)(int)(k * 2 + 2.5D);
/* 213 */       if (f2 <= -k) b2 = (byte)(int)(k * 2 + 2.5D);
/* 214 */       if (f1 >= k) b1 = (byte)(k * 2 + 1);
/* 215 */       if (f2 >= k) b2 = (byte)(k * 2 + 1);
/*     */     } else {
/* 217 */       this.g.remove(paramString);
/* 218 */       return;
/*     */     }
/*     */     
/* 221 */     this.g.put(paramString, new ayk(this, (byte)paramInt, b1, b2, b3));
/*     */   }
/*     */   
/*     */   public byte[] a(add paramadd, ahb paramahb, yz paramyz) {
/* 225 */     ayj localayj = (ayj)this.i.get(paramyz);
/* 226 */     if (localayj == null) { return null;
/*     */     }
/* 228 */     return localayj.a(paramadd);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/* 232 */     super.c();
/* 233 */     for (int j = 0; j < this.f.size(); j++) {
/* 234 */       ayj localayj = (ayj)this.f.get(j);
/* 235 */       if ((localayj.b[paramInt1] < 0) || (localayj.b[paramInt1] > paramInt2)) localayj.b[paramInt1] = paramInt2;
/* 236 */       if ((localayj.c[paramInt1] < 0) || (localayj.c[paramInt1] < paramInt3)) localayj.c[paramInt1] = paramInt3;
/*     */     } }
/*     */   
/*     */   public void a(byte[] paramArrayOfByte) { int j;
/*     */     int k;
/* 241 */     if (paramArrayOfByte[0] == 0) {
/* 242 */       j = paramArrayOfByte[1] & 0xFF;
/* 243 */       k = paramArrayOfByte[2] & 0xFF;
/* 244 */       for (int m = 0; m < paramArrayOfByte.length - 3; m++) {
/* 245 */         this.e[((m + k) * 128 + j)] = paramArrayOfByte[(m + 3)];
/*     */       }
/* 247 */       c();
/* 248 */     } else if (paramArrayOfByte[0] == 1) {
/* 249 */       this.g.clear();
/* 250 */       for (j = 0; j < (paramArrayOfByte.length - 1) / 3; j++) {
/* 251 */         k = (byte)(paramArrayOfByte[(j * 3 + 1)] >> 4);
/* 252 */         byte b1 = paramArrayOfByte[(j * 3 + 2)];
/* 253 */         byte b2 = paramArrayOfByte[(j * 3 + 3)];
/* 254 */         byte b3 = (byte)(paramArrayOfByte[(j * 3 + 1)] & 0xF);
/* 255 */         this.g.put("icon-" + j, new ayk(this, k, b1, b2, b3));
/*     */       }
/* 257 */     } else if (paramArrayOfByte[0] == 2) {
/* 258 */       this.d = paramArrayOfByte[1];
/*     */     }
/*     */   }
/*     */   
/*     */   public ayj a(yz paramyz) {
/* 263 */     ayj localayj = (ayj)this.i.get(paramyz);
/*     */     
/* 265 */     if (localayj == null) {
/* 266 */       localayj = new ayj(this, paramyz);
/* 267 */       this.i.put(paramyz, localayj);
/* 268 */       this.f.add(localayj);
/*     */     }
/*     */     
/* 271 */     return localayj;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ayi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */