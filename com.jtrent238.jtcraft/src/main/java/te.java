/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.locks.Lock;
/*     */ import java.util.concurrent.locks.ReadWriteLock;
/*     */ import java.util.concurrent.locks.ReentrantReadWriteLock;
/*     */ import org.apache.commons.lang3.ObjectUtils;
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
/*     */ public class te
/*     */ {
/*     */   private final sa a;
/*  26 */   private boolean b = true;
/*     */   
/*  28 */   private static final HashMap c = new HashMap();
/*     */   
/*     */   static {
/*  31 */     c.put(Byte.class, Integer.valueOf(0));
/*  32 */     c.put(Short.class, Integer.valueOf(1));
/*  33 */     c.put(Integer.class, Integer.valueOf(2));
/*  34 */     c.put(Float.class, Integer.valueOf(3));
/*  35 */     c.put(String.class, Integer.valueOf(4));
/*  36 */     c.put(add.class, Integer.valueOf(5));
/*  37 */     c.put(r.class, Integer.valueOf(6));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  47 */   private final Map d = new HashMap();
/*     */   private boolean e;
/*  49 */   private ReadWriteLock f = new ReentrantReadWriteLock();
/*     */   
/*     */   public te(sa paramsa) {
/*  52 */     this.a = paramsa;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, Object paramObject) {
/*  56 */     Integer localInteger = (Integer)c.get(paramObject.getClass());
/*  57 */     if (localInteger == null) {
/*  58 */       throw new IllegalArgumentException("Unknown data type: " + paramObject.getClass());
/*     */     }
/*  60 */     if (paramInt > 31) {
/*  61 */       throw new IllegalArgumentException("Data value id is too big with " + paramInt + "! (Max is " + 31 + ")");
/*     */     }
/*  63 */     if (this.d.containsKey(Integer.valueOf(paramInt))) {
/*  64 */       throw new IllegalArgumentException("Duplicate id value for " + paramInt + "!");
/*     */     }
/*     */     
/*  67 */     tf localtf = new tf(localInteger.intValue(), paramInt, paramObject);
/*  68 */     this.f.writeLock().lock();
/*  69 */     this.d.put(Integer.valueOf(paramInt), localtf);
/*  70 */     this.f.writeLock().unlock();
/*  71 */     this.b = false;
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2) {
/*  75 */     tf localtf = new tf(paramInt2, paramInt1, null);
/*  76 */     this.f.writeLock().lock();
/*  77 */     this.d.put(Integer.valueOf(paramInt1), localtf);
/*  78 */     this.f.writeLock().unlock();
/*  79 */     this.b = false;
/*     */   }
/*     */   
/*     */   public byte a(int paramInt) {
/*  83 */     return ((Byte)i(paramInt).b()).byteValue();
/*     */   }
/*     */   
/*     */   public short b(int paramInt) {
/*  87 */     return ((Short)i(paramInt).b()).shortValue();
/*     */   }
/*     */   
/*     */   public int c(int paramInt) {
/*  91 */     return ((Integer)i(paramInt).b()).intValue();
/*     */   }
/*     */   
/*     */   public float d(int paramInt) {
/*  95 */     return ((Float)i(paramInt).b()).floatValue();
/*     */   }
/*     */   
/*     */   public String e(int paramInt) {
/*  99 */     return (String)i(paramInt).b();
/*     */   }
/*     */   
/*     */   public add f(int paramInt) {
/* 103 */     return (add)i(paramInt).b();
/*     */   }
/*     */   
/*     */   private tf i(int paramInt)
/*     */   {
/* 108 */     this.f.readLock().lock();
/*     */     tf localtf;
/*     */     try {
/* 111 */       localtf = (tf)this.d.get(Integer.valueOf(paramInt));
/*     */     } catch (Throwable localThrowable) {
/* 113 */       b localb = b.a(localThrowable, "Getting synched entity data");
/* 114 */       k localk = localb.a("Synched entity data");
/*     */       
/* 116 */       localk.a("Data ID", Integer.valueOf(paramInt));
/* 117 */       throw new s(localb);
/*     */     }
/*     */     
/* 120 */     this.f.readLock().unlock();
/* 121 */     return localtf;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void b(int paramInt, Object paramObject)
/*     */   {
/* 130 */     tf localtf = i(paramInt);
/*     */     
/*     */ 
/* 133 */     if (ObjectUtils.notEqual(paramObject, localtf.b())) {
/* 134 */       localtf.a(paramObject);
/* 135 */       this.a.i(paramInt);
/* 136 */       localtf.a(true);
/* 137 */       this.e = true;
/*     */     }
/*     */   }
/*     */   
/*     */   public void h(int paramInt) {
/* 142 */     tf.a(i(paramInt), true);
/* 143 */     this.e = true;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 147 */     return this.e;
/*     */   }
/*     */   
/*     */   public static void a(List paramList, et paramet) {
/* 151 */     if (paramList != null) {
/* 152 */       for (tf localtf : paramList) {
/* 153 */         a(paramet, localtf);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 158 */     paramet.writeByte(127);
/*     */   }
/*     */   
/*     */   public List b() {
/* 162 */     ArrayList localArrayList = null;
/*     */     
/* 164 */     if (this.e) {
/* 165 */       this.f.readLock().lock();
/* 166 */       for (tf localtf : this.d.values()) {
/* 167 */         if (localtf.d()) {
/* 168 */           localtf.a(false);
/*     */           
/* 170 */           if (localArrayList == null) {
/* 171 */             localArrayList = new ArrayList();
/*     */           }
/* 173 */           localArrayList.add(localtf);
/*     */         }
/*     */       }
/* 176 */       this.f.readLock().unlock();
/*     */     }
/* 178 */     this.e = false;
/*     */     
/* 180 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public void a(et paramet) {
/* 184 */     this.f.readLock().lock();
/* 185 */     for (tf localtf : this.d.values()) {
/* 186 */       a(paramet, localtf);
/*     */     }
/* 188 */     this.f.readLock().unlock();
/*     */     
/*     */ 
/* 191 */     paramet.writeByte(127);
/*     */   }
/*     */   
/*     */   public List c() {
/* 195 */     ArrayList localArrayList = null;
/*     */     
/* 197 */     this.f.readLock().lock();
/* 198 */     for (tf localtf : this.d.values()) {
/* 199 */       if (localArrayList == null) {
/* 200 */         localArrayList = new ArrayList();
/*     */       }
/* 202 */       localArrayList.add(localtf);
/*     */     }
/* 204 */     this.f.readLock().unlock();
/*     */     
/* 206 */     return localArrayList;
/*     */   }
/*     */   
/*     */   private static void a(et paramet, tf paramtf)
/*     */   {
/* 211 */     int i = (paramtf.c() << 5 | paramtf.a() & 0x1F) & 0xFF;
/* 212 */     paramet.writeByte(i);
/*     */     
/*     */     Object localObject;
/* 215 */     switch (paramtf.c()) {
/*     */     case 0: 
/* 217 */       paramet.writeByte(((Byte)paramtf.b()).byteValue());
/* 218 */       break;
/*     */     case 1: 
/* 220 */       paramet.writeShort(((Short)paramtf.b()).shortValue());
/* 221 */       break;
/*     */     case 2: 
/* 223 */       paramet.writeInt(((Integer)paramtf.b()).intValue());
/* 224 */       break;
/*     */     case 3: 
/* 226 */       paramet.writeFloat(((Float)paramtf.b()).floatValue());
/* 227 */       break;
/*     */     case 4: 
/* 229 */       paramet.a((String)paramtf.b());
/* 230 */       break;
/*     */     case 5: 
/* 232 */       localObject = (add)paramtf.b();
/* 233 */       paramet.a((add)localObject);
/*     */       
/* 235 */       break;
/*     */     case 6: 
/* 237 */       localObject = (r)paramtf.b();
/* 238 */       paramet.writeInt(((r)localObject).a);
/* 239 */       paramet.writeInt(((r)localObject).b);
/* 240 */       paramet.writeInt(((r)localObject).c);
/*     */     }
/*     */   }
/*     */   
/*     */   public static List b(et paramet)
/*     */   {
/* 246 */     ArrayList localArrayList = null;
/*     */     
/* 248 */     int i = paramet.readByte();
/*     */     
/* 250 */     while (i != 127)
/*     */     {
/* 252 */       if (localArrayList == null) {
/* 253 */         localArrayList = new ArrayList();
/*     */       }
/*     */       
/*     */ 
/* 257 */       int j = (i & 0xE0) >> 5;
/* 258 */       int k = i & 0x1F;
/*     */       
/* 260 */       tf localtf = null;
/* 261 */       switch (j) {
/*     */       case 0: 
/* 263 */         localtf = new tf(j, k, Byte.valueOf(paramet.readByte()));
/* 264 */         break;
/*     */       case 1: 
/* 266 */         localtf = new tf(j, k, Short.valueOf(paramet.readShort()));
/* 267 */         break;
/*     */       case 2: 
/* 269 */         localtf = new tf(j, k, Integer.valueOf(paramet.readInt()));
/* 270 */         break;
/*     */       case 3: 
/* 272 */         localtf = new tf(j, k, Float.valueOf(paramet.readFloat()));
/* 273 */         break;
/*     */       case 4: 
/* 275 */         localtf = new tf(j, k, paramet.c(32767));
/* 276 */         break;
/*     */       case 5: 
/* 278 */         localtf = new tf(j, k, paramet.c());
/* 279 */         break;
/*     */       case 6: 
/* 281 */         int m = paramet.readInt();
/* 282 */         int n = paramet.readInt();
/* 283 */         int i1 = paramet.readInt();
/* 284 */         localtf = new tf(j, k, new r(m, n, i1));
/*     */       }
/*     */       
/* 287 */       localArrayList.add(localtf);
/*     */       
/* 289 */       i = paramet.readByte();
/*     */     }
/*     */     
/* 292 */     return localArrayList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(List paramList)
/*     */   {
/* 301 */     this.f.writeLock().lock();
/* 302 */     for (tf localtf1 : paramList) {
/* 303 */       tf localtf2 = (tf)this.d.get(Integer.valueOf(localtf1.a()));
/* 304 */       if (localtf2 != null) {
/* 305 */         localtf2.a(localtf1.b());
/* 306 */         this.a.i(localtf1.a());
/*     */       }
/*     */     }
/* 309 */     this.f.writeLock().unlock();
/*     */     
/*     */ 
/* 312 */     this.e = true;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 316 */     return this.b;
/*     */   }
/*     */   
/*     */   public void e() {
/* 320 */     this.e = false;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\te.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */