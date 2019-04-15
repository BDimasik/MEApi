package com.mineexperts.api.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.bukkit.Bukkit;

public final class Reflections {

	public static Class<?> getNMSClass(String name) {
		return getClass("net.minecraft.server." + getVersion() + "." + name);
	}
	
	public static Class<?> getCraftClass(String name) {
		return getClass("org.bukkit.craftbukkit." + getVersion() + "." + name);
	}
	
	public static String getVersion() {
		return Bukkit.getServer().getClass().getPackage().getName().substring(23);
	}
	
	public static Object getValue(Object from, String fieldName) {
		try {
			Field field = from.getClass().getDeclaredField(fieldName);
			if (!field.isAccessible())
				field.setAccessible(true);
			return field.get(from);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		
		return null;
	}
	
	public static Method getMethod(Object from, String methodName, Class<?>... params) {
		try {
			Method method = from.getClass().getMethod(methodName, params);
			if (!method.isAccessible())
				method.setAccessible(true);
			return method;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static Field getField(Field field) {
		field.setAccessible(true);
		return field;
	}
	
	public static Constructor<?> getConstructor(Class<?> clazz, Class<?>... parameters) {
		try {
			return clazz.getConstructor(parameters);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static Object construct(Constructor<?> constructor, Object... initargs) {
		try {
			return constructor.newInstance(initargs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static Class<?> getClass(String name) {
		try {
			return Class.forName(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}