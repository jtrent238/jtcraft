/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ public class bnw
/*     */   extends bok
/*     */ {
/*     */   protected bhm a;
/*     */   protected float f;
/*     */   protected bhm g;
/*     */   protected bhm h;
/*  30 */   private static final Map k = ;
/*     */   
/*  32 */   private static final String[] l = { "leather", "chainmail", "iron", "diamond", "gold" };
/*     */   
/*     */ 
/*     */   public bnw(bhm parambhm, float paramFloat)
/*     */   {
/*  37 */     this(parambhm, paramFloat, 1.0F);
/*     */   }
/*     */   
/*     */   public bnw(bhm parambhm, float paramFloat1, float paramFloat2) {
/*  41 */     super(parambhm, paramFloat1);
/*  42 */     this.a = parambhm;
/*  43 */     this.f = paramFloat2;
/*     */     
/*  45 */     d();
/*     */   }
/*     */   
/*     */   protected void d() {
/*  49 */     this.g = new bhm(1.0F);
/*  50 */     this.h = new bhm(0.5F);
/*     */   }
/*     */   
/*     */   public static bqx a(abb paramabb, int paramInt) {
/*  54 */     return a(paramabb, paramInt, null);
/*     */   }
/*     */   
/*     */   public static bqx a(abb paramabb, int paramInt, String paramString) {
/*  58 */     String str = String.format("textures/models/armor/%s_layer_%d%s.png", new Object[] { l[paramabb.d], Integer.valueOf(paramInt == 2 ? 2 : 1), paramString == null ? "" : String.format("_%s", new Object[] { paramString }) });
/*     */     
/*  60 */     bqx localbqx = (bqx)k.get(str);
/*  61 */     if (localbqx == null) {
/*  62 */       localbqx = new bqx(str);
/*  63 */       k.put(str, localbqx);
/*     */     }
/*     */     
/*  66 */     return localbqx;
/*     */   }
/*     */   
/*     */   protected int a(sw paramsw, int paramInt, float paramFloat)
/*     */   {
/*  71 */     add localadd = paramsw.r(3 - paramInt);
/*  72 */     if (localadd != null) {
/*  73 */       adb localadb = localadd.b();
/*  74 */       if ((localadb instanceof abb)) {
/*  75 */         abb localabb = (abb)localadb;
/*  76 */         a(a(localabb, paramInt));
/*     */         
/*  78 */         bhm localbhm = paramInt == 2 ? this.h : this.g;
/*     */         
/*  80 */         localbhm.c.j = (paramInt == 0);
/*  81 */         localbhm.d.j = (paramInt == 0);
/*  82 */         localbhm.e.j = ((paramInt == 1) || (paramInt == 2));
/*  83 */         localbhm.f.j = (paramInt == 1);
/*  84 */         localbhm.g.j = (paramInt == 1);
/*  85 */         localbhm.h.j = ((paramInt == 2) || (paramInt == 3));
/*  86 */         localbhm.i.j = ((paramInt == 2) || (paramInt == 3));
/*     */         
/*  88 */         a(localbhm);
/*  89 */         localbhm.p = this.i.p;
/*  90 */         localbhm.q = this.i.q;
/*  91 */         localbhm.s = this.i.s;
/*     */         
/*  93 */         if (localabb.m_() == abd.a) {
/*  94 */           int i = localabb.b(localadd);
/*  95 */           float f1 = (i >> 16 & 0xFF) / 255.0F;
/*  96 */           float f2 = (i >> 8 & 0xFF) / 255.0F;
/*  97 */           float f3 = (i & 0xFF) / 255.0F;
/*  98 */           GL11.glColor3f(f1, f2, f3);
/*     */           
/* 100 */           if (localadd.y()) return 31;
/* 101 */           return 16;
/*     */         }
/*     */         
/* 104 */         GL11.glColor3f(1.0F, 1.0F, 1.0F);
/*     */         
/*     */ 
/* 107 */         if (localadd.y()) { return 15;
/*     */         }
/* 109 */         return 1;
/*     */       }
/*     */     }
/* 112 */     return -1;
/*     */   }
/*     */   
/*     */   protected void b(sw paramsw, int paramInt, float paramFloat)
/*     */   {
/* 117 */     add localadd = paramsw.r(3 - paramInt);
/* 118 */     if (localadd != null) {
/* 119 */       adb localadb = localadd.b();
/* 120 */       if ((localadb instanceof abb)) {
/* 121 */         a(a((abb)localadb, paramInt, "overlay"));
/*     */         
/* 123 */         float f1 = 1.0F;
/* 124 */         GL11.glColor3f(1.0F, 1.0F, 1.0F);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(sw paramsw, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*     */   {
/* 131 */     GL11.glColor3f(1.0F, 1.0F, 1.0F);
/* 132 */     add localadd = paramsw.be();
/*     */     
/* 134 */     a(paramsw, localadd);
/*     */     
/* 136 */     double d = paramDouble2 - paramsw.L;
/* 137 */     if (paramsw.an()) {
/* 138 */       d -= 0.125D;
/*     */     }
/* 140 */     super.a(paramsw, paramDouble1, d, paramDouble3, paramFloat1, paramFloat2);
/* 141 */     this.g.o = (this.h.o = this.a.o = 0);
/* 142 */     this.g.n = (this.h.n = this.a.n = 0);
/* 143 */     this.g.m = (this.h.m = this.a.m = 0);
/*     */   }
/*     */   
/*     */ 
/*     */   protected bqx a(sw paramsw)
/*     */   {
/* 149 */     return null;
/*     */   }
/*     */   
/*     */   protected void a(sw paramsw, add paramadd) {
/* 153 */     this.g.m = (this.h.m = this.a.m = paramadd != null ? 1 : 0);
/* 154 */     this.g.n = (this.h.n = this.a.n = paramsw.an());
/*     */   }
/*     */   
/*     */   protected void a(sw paramsw, float paramFloat)
/*     */   {
/* 159 */     GL11.glColor3f(1.0F, 1.0F, 1.0F);
/* 160 */     super.c(paramsw, paramFloat);
/* 161 */     add localadd1 = paramsw.be();
/* 162 */     add localadd2 = paramsw.r(3);
/*     */     adb localadb;
/* 164 */     float f1; if (localadd2 != null) {
/* 165 */       GL11.glPushMatrix();
/* 166 */       this.a.c.c(0.0625F);
/*     */       
/* 168 */       localadb = localadd2.b();
/* 169 */       if ((localadb instanceof abh)) {
/* 170 */         if (blm.a(aji.a(localadb).b())) {
/* 171 */           f1 = 0.625F;
/* 172 */           GL11.glTranslatef(0.0F, -0.25F, 0.0F);
/* 173 */           GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 174 */           GL11.glScalef(f1, -f1, -f1);
/*     */         }
/*     */         
/* 177 */         this.b.f.a(paramsw, localadd2, 0);
/* 178 */       } else if (localadb == ade.bL) {
/* 179 */         f1 = 1.0625F;
/* 180 */         GL11.glScalef(f1, -f1, -f1);
/*     */         
/* 182 */         GameProfile localGameProfile = null;
/* 183 */         if (localadd2.p()) {
/* 184 */           dh localdh = localadd2.q();
/* 185 */           if (localdh.b("SkullOwner", 10)) {
/* 186 */             localGameProfile = dv.a(localdh.m("SkullOwner"));
/* 187 */           } else if ((localdh.b("SkullOwner", 8)) && (!qn.b(localdh.j("SkullOwner")))) {
/* 188 */             localGameProfile = new GameProfile(null, localdh.j("SkullOwner"));
/*     */           }
/*     */         }
/*     */         
/* 192 */         bms.b.a(-0.5F, 0.0F, -0.5F, 1, 180.0F, localadd2.k(), localGameProfile);
/*     */       }
/*     */       
/* 195 */       GL11.glPopMatrix();
/*     */     }
/*     */     
/* 198 */     if ((localadd1 != null) && (localadd1.b() != null)) {
/* 199 */       localadb = localadd1.b();
/* 200 */       GL11.glPushMatrix();
/*     */       
/* 202 */       if (this.i.s) {
/* 203 */         f1 = 0.5F;
/* 204 */         GL11.glTranslatef(0.0F, 0.625F, 0.0F);
/* 205 */         GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
/* 206 */         GL11.glScalef(f1, f1, f1);
/*     */       }
/*     */       
/* 209 */       this.a.f.c(0.0625F);
/* 210 */       GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
/*     */       
/* 212 */       if (((localadb instanceof abh)) && (blm.a(aji.a(localadb).b()))) {
/* 213 */         f1 = 0.5F;
/* 214 */         GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
/* 215 */         f1 *= 0.75F;
/* 216 */         GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
/* 217 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 218 */         GL11.glScalef(-f1, -f1, f1);
/* 219 */       } else if (localadb == ade.f) {
/* 220 */         f1 = 0.625F;
/* 221 */         GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
/* 222 */         GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
/* 223 */         GL11.glScalef(f1, -f1, f1);
/* 224 */         GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
/* 225 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 226 */       } else if (localadb.f()) {
/* 227 */         f1 = 0.625F;
/* 228 */         if (localadb.g()) {
/* 229 */           GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/* 230 */           GL11.glTranslatef(0.0F, -0.125F, 0.0F);
/*     */         }
/* 232 */         e();
/* 233 */         GL11.glScalef(f1, -f1, f1);
/* 234 */         GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
/* 235 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/*     */       } else {
/* 237 */         f1 = 0.375F;
/* 238 */         GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
/* 239 */         GL11.glScalef(f1, f1, f1);
/* 240 */         GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
/* 241 */         GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/* 242 */         GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
/*     */       }
/*     */       int i;
/*     */       float f3;
/*     */       float f4;
/* 247 */       if (localadd1.b().b()) {
/* 248 */         for (i = 0; i <= 1; i++) {
/* 249 */           int j = localadd1.b().a(localadd1, i);
/* 250 */           f3 = (j >> 16 & 0xFF) / 255.0F;
/* 251 */           f4 = (j >> 8 & 0xFF) / 255.0F;
/* 252 */           float f5 = (j & 0xFF) / 255.0F;
/*     */           
/* 254 */           GL11.glColor4f(f3, f4, f5, 1.0F);
/* 255 */           this.b.f.a(paramsw, localadd1, i);
/*     */         }
/*     */       } else {
/* 258 */         i = localadd1.b().a(localadd1, 0);
/* 259 */         float f2 = (i >> 16 & 0xFF) / 255.0F;
/* 260 */         f3 = (i >> 8 & 0xFF) / 255.0F;
/* 261 */         f4 = (i & 0xFF) / 255.0F;
/*     */         
/* 263 */         GL11.glColor4f(f2, f3, f4, 1.0F);
/* 264 */         this.b.f.a(paramsw, localadd1, 0);
/*     */       }
/*     */       
/* 267 */       GL11.glPopMatrix();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void e() {
/* 272 */     GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */