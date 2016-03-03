/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class blo
/*     */ {
/*     */   private bmi y;
/*     */   public ahb a;
/*  27 */   private int z = -1;
/*     */   
/*  29 */   private static bmh A = bmh.a;
/*     */   public static int b;
/*     */   public int c;
/*     */   public int d;
/*     */   public int e;
/*     */   public int f;
/*     */   public int g;
/*     */   public int h;
/*     */   public int i;
/*  38 */   public int j; public int k; public boolean l; public boolean[] m = new boolean[2];
/*     */   public int n;
/*     */   public int o;
/*     */   public int p;
/*     */   public boolean q;
/*     */   public azt r;
/*  44 */   public int s; public boolean t = true;
/*     */   public boolean u;
/*     */   public int v;
/*     */   public boolean w;
/*     */   private boolean B;
/*  49 */   public List x = new ArrayList();
/*     */   
/*     */   private List C;
/*     */   private int D;
/*     */   
/*     */   public blo(ahb paramahb, List paramList, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  56 */     this.a = paramahb;
/*  57 */     this.y = null;
/*  58 */     this.C = paramList;
/*     */     
/*  60 */     this.z = paramInt4;
/*     */     
/*  62 */     this.c = 64537;
/*  63 */     a(paramInt1, paramInt2, paramInt3);
/*     */     
/*  65 */     this.q = false;
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  70 */     if ((paramInt1 == this.c) && (paramInt2 == this.d) && (paramInt3 == this.e)) { return;
/*     */     }
/*  72 */     a();
/*  73 */     this.c = paramInt1;
/*  74 */     this.d = paramInt2;
/*  75 */     this.e = paramInt3;
/*  76 */     this.n = (paramInt1 + 8);
/*  77 */     this.o = (paramInt2 + 8);
/*  78 */     this.p = (paramInt3 + 8);
/*     */     
/*  80 */     this.i = (paramInt1 & 0x3FF);
/*  81 */     this.j = paramInt2;
/*  82 */     this.k = (paramInt3 & 0x3FF);
/*  83 */     this.f = (paramInt1 - this.i);
/*  84 */     this.g = (paramInt2 - this.j);
/*  85 */     this.h = (paramInt3 - this.k);
/*     */     
/*  87 */     float f1 = 6.0F;
/*  88 */     this.r = azt.a(paramInt1 - f1, paramInt2 - f1, paramInt3 - f1, paramInt1 + 16 + f1, paramInt2 + 16 + f1, paramInt3 + 16 + f1);
/*     */     
/*  90 */     GL11.glNewList(this.z + 2, 4864);
/*  91 */     bny.a(azt.a(this.i - f1, this.j - f1, this.k - f1, this.i + 16 + f1, this.j + 16 + f1, this.k + 16 + f1));
/*  92 */     GL11.glEndList();
/*  93 */     e();
/*     */   }
/*     */   
/*     */   private void f() {
/*  97 */     GL11.glTranslatef(this.i, this.j, this.k);
/*     */   }
/*     */   
/*     */   public void a(sv paramsv) {
/* 101 */     if (!this.q) return;
/* 102 */     this.q = false;
/*     */     
/* 104 */     int i1 = this.c;
/* 105 */     int i2 = this.d;
/* 106 */     int i3 = this.e;
/* 107 */     int i4 = this.c + 16;
/* 108 */     int i5 = this.d + 16;
/* 109 */     int i6 = this.e + 16;
/* 110 */     for (int i7 = 0; i7 < 2; i7++) {
/* 111 */       this.m[i7] = true;
/*     */     }
/*     */     
/* 114 */     apx.a = false;
/*     */     
/* 116 */     HashSet localHashSet = new HashSet();
/* 117 */     localHashSet.addAll(this.x);
/* 118 */     this.x.clear();
/*     */     
/* 120 */     bao localbao = bao.B();
/* 121 */     sv localsv = localbao.i;
/* 122 */     int i8 = qh.c(localsv.s);
/* 123 */     int i9 = qh.c(localsv.t);
/* 124 */     int i10 = qh.c(localsv.u);
/* 125 */     int i11 = 1;
/* 126 */     ahr localahr = new ahr(this.a, i1 - i11, i2 - i11, i3 - i11, i4 + i11, i5 + i11, i6 + i11, i11);
/* 127 */     if (!localahr.T()) {
/* 128 */       b += 1;
/*     */       
/* 130 */       localObject = new blm(localahr);
/*     */       
/* 132 */       this.D = 0;
/* 133 */       this.y = null;
/*     */       
/* 135 */       for (int i12 = 0; i12 < 2; i12++) {
/* 136 */         int i13 = 0;
/* 137 */         boolean bool = false;
/*     */         
/* 139 */         int i14 = 0;
/*     */         
/* 141 */         for (int i15 = i2; i15 < i5; i15++) {
/* 142 */           for (int i16 = i3; i16 < i6; i16++) {
/* 143 */             for (int i17 = i1; i17 < i4; i17++) {
/* 144 */               aji localaji = localahr.a(i17, i15, i16);
/*     */               
/* 146 */               if (localaji.o() != awt.a) {
/* 147 */                 if (i14 == 0) {
/* 148 */                   i14 = 1;
/* 149 */                   b(i12);
/*     */                 }
/*     */                 
/* 152 */                 if ((i12 == 0) && (localaji.u())) {
/* 153 */                   aor localaor = localahr.o(i17, i15, i16);
/* 154 */                   if (bmk.a.a(localaor)) {
/* 155 */                     this.x.add(localaor);
/*     */                   }
/*     */                 }
/* 158 */                 int i18 = localaji.w();
/*     */                 
/* 160 */                 if (i18 > i12) {
/* 161 */                   i13 = 1;
/* 162 */                 } else if (i18 == i12) {
/* 163 */                   bool |= ((blm)localObject).b(localaji, i17, i15, i16);
/* 164 */                   if ((localaji.b() == 0) && (i17 == i8) && (i15 == i9) && (i16 == i10)) {
/* 165 */                     ((blm)localObject).a(true);
/* 166 */                     ((blm)localObject).b(true);
/* 167 */                     ((blm)localObject).b(localaji, i17, i15, i16);
/* 168 */                     ((blm)localObject).a(false);
/* 169 */                     ((blm)localObject).b(false);
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/* 176 */         if (bool) this.m[i12] = false;
/* 177 */         if (i14 != 0) {
/* 178 */           a(i12, paramsv);
/*     */         } else {
/* 180 */           bool = false;
/*     */         }
/* 182 */         if (i13 == 0) {
/*     */           break;
/*     */         }
/*     */       }
/*     */     }
/* 187 */     Object localObject = new HashSet();
/* 188 */     ((Set)localObject).addAll(this.x);
/* 189 */     ((Set)localObject).removeAll(localHashSet);
/* 190 */     this.C.addAll((Collection)localObject);
/*     */     
/* 192 */     localHashSet.removeAll(this.x);
/* 193 */     this.C.removeAll(localHashSet);
/*     */     
/* 195 */     this.w = apx.a;
/* 196 */     this.B = true;
/*     */   }
/*     */   
/*     */   private void b(int paramInt) {
/* 200 */     GL11.glNewList(this.z + paramInt, 4864);
/* 201 */     GL11.glPushMatrix();
/* 202 */     f();
/* 203 */     float f1 = 1.000001F;
/* 204 */     GL11.glTranslatef(-8.0F, -8.0F, -8.0F);
/* 205 */     GL11.glScalef(f1, f1, f1);
/* 206 */     GL11.glTranslatef(8.0F, 8.0F, 8.0F);
/* 207 */     A.b();
/* 208 */     A.b(-this.c, -this.d, -this.e);
/*     */   }
/*     */   
/*     */   private void a(int paramInt, sv paramsv) {
/* 212 */     if ((paramInt == 1) && (this.m[paramInt] == 0)) {
/* 213 */       this.y = A.a((float)paramsv.s, (float)paramsv.t, (float)paramsv.u);
/*     */     }
/* 215 */     this.D += A.a();
/* 216 */     GL11.glPopMatrix();
/* 217 */     GL11.glEndList();
/* 218 */     A.b(0.0D, 0.0D, 0.0D);
/*     */   }
/*     */   
/*     */   public void b(sv paramsv) {
/* 222 */     if ((this.y == null) || (this.m[1] != 0)) {
/* 223 */       return;
/*     */     }
/*     */     
/* 226 */     b(1);
/*     */     
/* 228 */     A.a(this.y);
/*     */     
/* 230 */     a(1, paramsv);
/*     */   }
/*     */   
/*     */ 
/*     */   public float a(sa paramsa)
/*     */   {
/* 236 */     float f1 = (float)(paramsa.s - this.n);
/* 237 */     float f2 = (float)(paramsa.t - this.o);
/* 238 */     float f3 = (float)(paramsa.u - this.p);
/*     */     
/* 240 */     return f1 * f1 + f2 * f2 + f3 * f3;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a()
/*     */   {
/* 253 */     for (int i1 = 0; i1 < 2; i1++) {
/* 254 */       this.m[i1] = true;
/*     */     }
/*     */     
/* 257 */     this.l = false;
/* 258 */     this.B = false;
/* 259 */     this.y = null;
/*     */   }
/*     */   
/*     */   public void b() {
/* 263 */     a();
/* 264 */     this.a = null;
/*     */   }
/*     */   
/*     */   public int a(int paramInt) {
/* 268 */     if (!this.l) return -1;
/* 269 */     if (this.m[paramInt] == 0) return this.z + paramInt;
/* 270 */     return -1;
/*     */   }
/*     */   
/*     */   public void a(bmv parambmv) {
/* 274 */     this.l = parambmv.a(this.r);
/*     */   }
/*     */   
/*     */   public void c() {
/* 278 */     GL11.glCallList(this.z + 2);
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 282 */     if (!this.B) return false;
/* 283 */     return (this.m[0] != 0) && (this.m[1] != 0);
/*     */   }
/*     */   
/*     */   public void e() {
/* 287 */     this.q = true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\blo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */