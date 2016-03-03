/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ public class aqk
/*     */   implements aqc, azs
/*     */ {
/*  17 */   private static final Logger a = ;
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
/*  30 */   private List b = new ArrayList();
/*  31 */   private Set c = new HashSet();
/*  32 */   private Object d = new Object();
/*     */   private final File e;
/*     */   
/*     */   public aqk(File paramFile)
/*     */   {
/*  37 */     this.e = paramFile;
/*     */   }
/*     */   
/*     */ 
/*     */   public apx a(ahb paramahb, int paramInt1, int paramInt2)
/*     */   {
/*  43 */     dh localdh = null;
/*  44 */     agu localagu = new agu(paramInt1, paramInt2);
/*     */     
/*  46 */     synchronized (this.d) {
/*  47 */       if (this.c.contains(localagu)) {
/*  48 */         for (int i = 0; i < this.b.size(); i++) {
/*  49 */           if (((aql)this.b.get(i)).a.equals(localagu)) {
/*  50 */             localdh = ((aql)this.b.get(i)).b;
/*  51 */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  57 */     if (localdh == null) {
/*  58 */       ??? = aqj.c(this.e, paramInt1, paramInt2);
/*  59 */       if (??? != null) {
/*  60 */         localdh = du.a((DataInputStream)???);
/*     */       } else {
/*  62 */         return null;
/*     */       }
/*     */     }
/*     */     
/*  66 */     return a(paramahb, paramInt1, paramInt2, localdh);
/*     */   }
/*     */   
/*     */   protected apx a(ahb paramahb, int paramInt1, int paramInt2, dh paramdh) {
/*  70 */     if (!paramdh.b("Level", 10)) {
/*  71 */       a.error("Chunk file at " + paramInt1 + "," + paramInt2 + " is missing level data, skipping");
/*  72 */       return null;
/*     */     }
/*  74 */     if (!paramdh.m("Level").b("Sections", 9)) {
/*  75 */       a.error("Chunk file at " + paramInt1 + "," + paramInt2 + " is missing block data, skipping");
/*  76 */       return null;
/*     */     }
/*  78 */     apx localapx = a(paramahb, paramdh.m("Level"));
/*  79 */     if (!localapx.a(paramInt1, paramInt2)) {
/*  80 */       a.error("Chunk file at " + paramInt1 + "," + paramInt2 + " is in the wrong location; relocating. (Expected " + paramInt1 + ", " + paramInt2 + ", got " + localapx.g + ", " + localapx.h + ")");
/*  81 */       paramdh.a("xPos", paramInt1);
/*  82 */       paramdh.a("zPos", paramInt2);
/*  83 */       localapx = a(paramahb, paramdh.m("Level"));
/*     */     }
/*  85 */     return localapx;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, apx paramapx)
/*     */   {
/*  90 */     paramahb.G();
/*     */     try
/*     */     {
/*  93 */       dh localdh1 = new dh();
/*  94 */       dh localdh2 = new dh();
/*  95 */       localdh1.a("Level", localdh2);
/*  96 */       a(paramapx, paramahb, localdh2);
/*  97 */       a(paramapx.l(), localdh1);
/*     */     } catch (Exception localException) {
/*  99 */       localException.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(agu paramagu, dh paramdh) {
/* 104 */     synchronized (this.d) {
/* 105 */       if (this.c.contains(paramagu)) {
/* 106 */         for (int i = 0; i < this.b.size(); i++) {
/* 107 */           if (((aql)this.b.get(i)).a.equals(paramagu)) {
/* 108 */             this.b.set(i, new aql(paramagu, paramdh));
/* 109 */             return;
/*     */           }
/*     */         }
/*     */       }
/* 113 */       this.b.add(new aql(paramagu, paramdh));
/* 114 */       this.c.add(paramagu);
/* 115 */       azr.a.a(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/* 121 */     aql localaql = null;
/*     */     
/* 123 */     synchronized (this.d) {
/* 124 */       if (!this.b.isEmpty()) {
/* 125 */         localaql = (aql)this.b.remove(0);
/* 126 */         this.c.remove(localaql.a);
/*     */       } else {
/* 128 */         return false;
/*     */       }
/*     */     }
/* 131 */     if (localaql != null) {
/*     */       try {
/* 133 */         a(localaql);
/*     */       } catch (Exception localException) {
/* 135 */         localException.printStackTrace();
/*     */       }
/*     */     }
/*     */     
/* 139 */     return true;
/*     */   }
/*     */   
/*     */   private void a(aql paramaql) {
/* 143 */     DataOutputStream localDataOutputStream = aqj.d(this.e, paramaql.a.a, paramaql.a.b);
/* 144 */     du.a(paramaql.b, localDataOutputStream);
/* 145 */     localDataOutputStream.close();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void b(ahb paramahb, apx paramapx) {}
/*     */   
/*     */ 
/*     */   public void a() {}
/*     */   
/*     */ 
/*     */   public void b()
/*     */   {
/* 158 */     while (c()) {}
/*     */   }
/*     */   
/*     */ 
/*     */   private void a(apx paramapx, ahb paramahb, dh paramdh)
/*     */   {
/* 164 */     paramdh.a("V", (byte)1);
/* 165 */     paramdh.a("xPos", paramapx.g);
/* 166 */     paramdh.a("zPos", paramapx.h);
/* 167 */     paramdh.a("LastUpdate", paramahb.I());
/* 168 */     paramdh.a("HeightMap", paramapx.f);
/* 169 */     paramdh.a("TerrainPopulated", paramapx.k);
/* 170 */     paramdh.a("LightPopulated", paramapx.l);
/* 171 */     paramdh.a("InhabitedTime", paramapx.s);
/*     */     
/* 173 */     apz[] arrayOfapz = paramapx.i();
/* 174 */     dq localdq1 = new dq();
/*     */     
/* 176 */     int i = !paramahb.t.g ? 1 : 0;
/*     */     Object localObject3;
/* 178 */     dh localdh1; for (localObject3 : arrayOfapz)
/*     */     {
/* 180 */       if (localObject3 != null)
/*     */       {
/*     */ 
/* 183 */         localdh1 = new dh();
/*     */         
/* 185 */         localdh1.a("Y", (byte)(((apz)localObject3).d() >> 4 & 0xFF));
/* 186 */         localdh1.a("Blocks", ((apz)localObject3).g());
/* 187 */         if (((apz)localObject3).i() != null) {
/* 188 */           localdh1.a("Add", ((apz)localObject3).i().a);
/*     */         }
/* 190 */         localdh1.a("Data", ((apz)localObject3).j().a);
/* 191 */         localdh1.a("BlockLight", ((apz)localObject3).k().a);
/* 192 */         if (i != 0) {
/* 193 */           localdh1.a("SkyLight", ((apz)localObject3).l().a);
/*     */         }
/*     */         else {
/* 196 */           localdh1.a("SkyLight", new byte[((apz)localObject3).k().a.length]);
/*     */         }
/*     */         
/* 199 */         localdq1.a(localdh1);
/*     */       } }
/* 201 */     paramdh.a("Sections", localdq1);
/* 202 */     paramdh.a("Biomes", paramapx.m());
/*     */     
/* 204 */     paramapx.o = false;
/* 205 */     ??? = new dq();
/* 206 */     for (??? = 0; ??? < paramapx.j.length; ???++) {
/* 207 */       for (localObject2 = paramapx.j[???].iterator(); ((Iterator)localObject2).hasNext();) { localObject3 = (sa)((Iterator)localObject2).next();
/* 208 */         localdh1 = new dh();
/* 209 */         if (((sa)localObject3).d(localdh1)) {
/* 210 */           paramapx.o = true;
/* 211 */           ((dq)???).a(localdh1);
/*     */         }
/*     */       }
/*     */     }
/* 215 */     paramdh.a("Entities", (dy)???);
/*     */     
/* 217 */     dq localdq2 = new dq();
/* 218 */     for (Object localObject2 = paramapx.i.values().iterator(); ((Iterator)localObject2).hasNext();) { localObject3 = (aor)((Iterator)localObject2).next();
/* 219 */       localdh1 = new dh();
/* 220 */       ((aor)localObject3).b(localdh1);
/* 221 */       localdq2.a(localdh1);
/*     */     }
/* 223 */     paramdh.a("TileEntities", localdq2);
/*     */     
/* 225 */     localObject2 = paramahb.a(paramapx, false);
/* 226 */     if (localObject2 != null) {
/* 227 */       long l = paramahb.I();
/*     */       
/* 229 */       dq localdq3 = new dq();
/* 230 */       for (ahs localahs : (List)localObject2) {
/* 231 */         dh localdh2 = new dh();
/* 232 */         localdh2.a("i", aji.b(localahs.a()));
/* 233 */         localdh2.a("x", localahs.a);
/* 234 */         localdh2.a("y", localahs.b);
/* 235 */         localdh2.a("z", localahs.c);
/* 236 */         localdh2.a("t", (int)(localahs.d - l));
/* 237 */         localdh2.a("p", localahs.e);
/*     */         
/* 239 */         localdq3.a(localdh2);
/*     */       }
/* 241 */       paramdh.a("TileTicks", localdq3);
/*     */     }
/*     */   }
/*     */   
/*     */   private apx a(ahb paramahb, dh paramdh)
/*     */   {
/* 247 */     int i = paramdh.f("xPos");
/* 248 */     int j = paramdh.f("zPos");
/*     */     
/* 250 */     apx localapx = new apx(paramahb, i, j);
/* 251 */     localapx.f = paramdh.l("HeightMap");
/* 252 */     localapx.k = paramdh.n("TerrainPopulated");
/* 253 */     localapx.l = paramdh.n("LightPopulated");
/* 254 */     localapx.s = paramdh.g("InhabitedTime");
/*     */     
/* 256 */     dq localdq1 = paramdh.c("Sections", 10);
/* 257 */     int k = 16;
/* 258 */     apz[] arrayOfapz = new apz[k];
/*     */     
/* 260 */     boolean bool = !paramahb.t.g;
/*     */     Object localObject1;
/* 262 */     for (int m = 0; m < localdq1.c(); m++) {
/* 263 */       dh localdh1 = localdq1.b(m);
/*     */       
/* 265 */       int i1 = localdh1.d("Y");
/* 266 */       localObject1 = new apz(i1 << 4, bool);
/* 267 */       ((apz)localObject1).a(localdh1.k("Blocks"));
/* 268 */       if (localdh1.b("Add", 7)) {
/* 269 */         ((apz)localObject1).a(new apv(localdh1.k("Add"), 4));
/*     */       }
/* 271 */       ((apz)localObject1).b(new apv(localdh1.k("Data"), 4));
/* 272 */       ((apz)localObject1).c(new apv(localdh1.k("BlockLight"), 4));
/* 273 */       if (bool) {
/* 274 */         ((apz)localObject1).d(new apv(localdh1.k("SkyLight"), 4));
/*     */       }
/* 276 */       ((apz)localObject1).e();
/*     */       
/* 278 */       arrayOfapz[i1] = localObject1;
/*     */     }
/* 280 */     localapx.a(arrayOfapz);
/* 281 */     if (paramdh.b("Biomes", 7)) {
/* 282 */       localapx.a(paramdh.k("Biomes"));
/*     */     }
/*     */     
/* 285 */     dq localdq2 = paramdh.c("Entities", 10);
/* 286 */     Object localObject2; if (localdq2 != null) {
/* 287 */       for (int n = 0; n < localdq2.c(); n++) {
/* 288 */         dh localdh2 = localdq2.b(n);
/* 289 */         localObject1 = sg.a(localdh2, paramahb);
/* 290 */         localapx.o = true;
/* 291 */         if (localObject1 != null) {
/* 292 */           localapx.a((sa)localObject1);
/*     */           
/*     */ 
/* 295 */           localObject2 = localObject1;
/* 296 */           dh localdh3 = localdh2;
/* 297 */           while (localdh3.b("Riding", 10)) {
/* 298 */             sa localsa = sg.a(localdh3.m("Riding"), paramahb);
/* 299 */             if (localsa != null) {
/* 300 */               localapx.a(localsa);
/* 301 */               ((sa)localObject2).a(localsa);
/*     */             }
/* 303 */             localObject2 = localsa;
/* 304 */             localdh3 = localdh3.m("Riding");
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 310 */     dq localdq3 = paramdh.c("TileEntities", 10);
/* 311 */     if (localdq3 != null) {
/* 312 */       for (int i2 = 0; i2 < localdq3.c(); i2++) {
/* 313 */         localObject1 = localdq3.b(i2);
/* 314 */         localObject2 = aor.c((dh)localObject1);
/* 315 */         if (localObject2 != null) {
/* 316 */           localapx.a((aor)localObject2);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 321 */     if (paramdh.b("TileTicks", 9)) {
/* 322 */       dq localdq4 = paramdh.c("TileTicks", 10);
/*     */       
/* 324 */       if (localdq4 != null) {
/* 325 */         for (int i3 = 0; i3 < localdq4.c(); i3++) {
/* 326 */           localObject2 = localdq4.b(i3);
/*     */           
/* 328 */           paramahb.b(((dh)localObject2).f("x"), ((dh)localObject2).f("y"), ((dh)localObject2).f("z"), aji.e(((dh)localObject2).f("i")), ((dh)localObject2).f("t"), ((dh)localObject2).f("p"));
/*     */         }
/*     */       }
/*     */     }
/* 332 */     return localapx;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aqk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */