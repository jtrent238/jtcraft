/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.io.Files;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.lang.reflect.ParameterizedType;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ public class om
/*     */ {
/*  20 */   protected static final Logger a = ;
/*     */   protected final Gson b;
/*     */   private final File c;
/*  23 */   private final Map d = Maps.newHashMap();
/*  24 */   private boolean e = true;
/*     */   
/*     */   public om(File paramFile) {
/*  27 */     this.c = paramFile;
/*  28 */     GsonBuilder localGsonBuilder = new GsonBuilder().setPrettyPrinting();
/*  29 */     localGsonBuilder.registerTypeHierarchyAdapter(ol.class, new oo(this, null));
/*  30 */     this.b = localGsonBuilder.create();
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  34 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/*  38 */     this.e = paramBoolean;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(ol paramol)
/*     */   {
/*  46 */     this.d.put(a(paramol.f()), paramol);
/*     */     try {
/*  48 */       f();
/*     */     } catch (IOException localIOException) {
/*  50 */       a.warn("Could not save the list after adding a user.", localIOException);
/*     */     }
/*     */   }
/*     */   
/*     */   public ol b(Object paramObject) {
/*  55 */     h();
/*  56 */     return (ol)this.d.get(a(paramObject));
/*     */   }
/*     */   
/*     */   public void c(Object paramObject) {
/*  60 */     this.d.remove(a(paramObject));
/*     */     try {
/*  62 */       f();
/*     */     } catch (IOException localIOException) {
/*  64 */       a.warn("Could not save the list after removing a user.", localIOException);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String[] a()
/*     */   {
/*  73 */     return (String[])this.d.keySet().toArray(new String[this.d.size()]);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected String a(Object paramObject)
/*     */   {
/*  81 */     return paramObject.toString();
/*     */   }
/*     */   
/*     */   protected boolean d(Object paramObject) {
/*  85 */     return this.d.containsKey(a(paramObject));
/*     */   }
/*     */   
/*     */   private void h() {
/*  89 */     ArrayList localArrayList = com.google.common.collect.Lists.newArrayList();
/*  90 */     for (Iterator localIterator = this.d.values().iterator(); localIterator.hasNext();) { localObject = (ol)localIterator.next();
/*  91 */       if (((ol)localObject).e())
/*  92 */         localArrayList.add(((ol)localObject).f());
/*     */     }
/*     */     Object localObject;
/*  95 */     for (localIterator = localArrayList.iterator(); localIterator.hasNext();) { localObject = localIterator.next();
/*  96 */       this.d.remove(localObject);
/*     */     }
/*     */   }
/*     */   
/*     */   protected ol a(JsonObject paramJsonObject) {
/* 101 */     return new ol((Object)null, paramJsonObject);
/*     */   }
/*     */   
/*     */   protected Map e() {
/* 105 */     return this.d;
/*     */   }
/*     */   
/*     */   public void f() {
/* 109 */     Collection localCollection = this.d.values();
/* 110 */     String str = this.b.toJson(localCollection);
/* 111 */     BufferedWriter localBufferedWriter = null;
/*     */     try {
/* 113 */       localBufferedWriter = Files.newWriter(this.c, com.google.common.base.Charsets.UTF_8);
/* 114 */       localBufferedWriter.write(str);
/*     */     } finally {
/* 116 */       org.apache.commons.io.IOUtils.closeQuietly(localBufferedWriter);
/*     */     }
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
/* 158 */   private static final ParameterizedType f = new on();
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\om.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */